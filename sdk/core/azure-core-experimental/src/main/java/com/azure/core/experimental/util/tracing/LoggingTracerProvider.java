// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.util.tracing;

import com.azure.core.util.Context;
import com.azure.core.util.TracingOptions;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LoggingEventBuilder;
import com.azure.core.util.tracing.SpanKind;
import com.azure.core.util.tracing.StartSpanOptions;
import com.azure.core.util.tracing.Tracer;
import com.azure.core.util.tracing.TracerProvider;

import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Implements tracer provider that records traces as logs.
 * It's disabled by default and does not support context propagation.
 */
public class LoggingTracerProvider implements TracerProvider {
    private static final TracingOptions DEFAULT_OPTIONS = new TracingOptions().setEnabled(false);

    /**
     * {@inheritDoc}
     */
    @Override
    public Tracer createTracer(String libraryName, String libraryVersion, String azNamespace, TracingOptions options) {
        return new LoggingTracer(options instanceof LoggingTracingOptions ? options : DEFAULT_OPTIONS);
    }

    /**
     * Options to configure {@link LoggingTracerProvider}.
     */
    public static class LoggingTracingOptions extends TracingOptions {
        /**
         * Creates new instance of {@link LoggingTracingOptions}
         */
        public LoggingTracingOptions() {
            super(LoggingTracerProvider.class);
        }
    }

    /**
     * Logging tracer implementation.
     */
    private static class LoggingTracer implements Tracer {
        private final boolean isEnabled;
        LoggingTracer(TracingOptions options) {
            this.isEnabled = options.isEnabled();
        }

        @Override
        public boolean isEnabled() {
            return isEnabled;
        }

        @Override
        public Context start(String name, Context context) {
            if (!isEnabled) {
                return context;
            }
            LoggingSpan span = new LoggingSpan(name, SpanKind.INTERNAL, getSpan(context));
            return context.addData("span", span);
        }

        @Override
        public Context start(String name, StartSpanOptions options, Context context) {
            if (!isEnabled) {
                return context;
            }

            LoggingSpan span = new LoggingSpan(name, options.getSpanKind(), getSpan(context));
            options.getAttributes().forEach((k, v) -> span.addKeyValue(k, v));
            span.addKeyValue("startTimestamp", options.getStartTimestamp());
            return context.addData("span", span);
        }

        @Override
        public void end(String errorMessage, Throwable throwable, Context context) {
            if (isEnabled) {
                LoggingSpan span = getSpan(context);
                span.addKeyValue("status", errorMessage);
                span.end(throwable);
            }
        }

        @Override
        public void setAttribute(String key, String value, Context context) {
            getSpan(context).addKeyValue(key, value);
        }

        @Override
        public void setAttribute(String key, long value, Context context) {
            getSpan(context).addKeyValue(key, value);
        }

        @Override
        public void injectContext(BiConsumer<String, String> headerSetter, Context context) {
            LoggingSpan span = getSpan(context);
            headerSetter.accept("traceparent", String.format("00-%s-%s-01", span.getTraceId(), span.getSpanId()));
        }

        @Override
        public Context extractContext(Function<String, String> headerGetter) {
            String traceparent = headerGetter.apply("traceparent");
            if (traceparent == null) {
                return Context.NONE;
            }

            String traceId = traceparent.substring(3, 35);
            String spanId = traceparent.substring(36, 52);
            LoggingSpan span = new LoggingSpan("extracted", SpanKind.INTERNAL, traceId, spanId);

            return new Context("span", span);
        }

        private LoggingSpan getSpan(Context context) {
            if (isEnabled && context != null) {
                Object span = context.getData("span").orElse(null);
                if (span != null) {
                    return (LoggingSpan) span;
                }
            }

            return LoggingSpan.NOOP;
        }
    }

    static final class LoggingSpan {
        public static final LoggingSpan NOOP = new LoggingSpan();
        private static final ClientLogger LOGGER = new ClientLogger(LoggingSpan.class);
        private final String traceId;
        private final String spanId;
        private final LoggingEventBuilder log;
        private final boolean enabled;

        private LoggingSpan() {
            this.traceId = null;
            this.spanId = null;
            this.log = null;
            this.enabled = false;
        }

        public String getTraceId() {
            return enabled ? traceId : "00000000000000000000000000000000";
        }

        public String getSpanId() {
            return enabled ? spanId : "0000000000000000";
        }

        LoggingSpan(String name, SpanKind kind, String traceId, String parentSpanId) {
            this.traceId = traceId != null ? traceId : UUID.randomUUID().toString().replace("-", "");
            this.spanId = UUID.randomUUID().toString().replace("-", "").substring(16);
            this.log = LOGGER.atInfo()
                .addKeyValue("traceId", this.traceId)
                .addKeyValue("spanId", spanId)
                .addKeyValue("parentSpanId", parentSpanId)
                .addKeyValue("name", name)
                .addKeyValue("kind", kind.name());

            log.log("span created");
            this.enabled = true;
        }

        LoggingSpan(String name, SpanKind kind, LoggingSpan parent) {
            this(name, kind, parent.enabled ? parent.traceId : null, parent.getSpanId());
        }

        public LoggingSpan addKeyValue(String key, Object value) {
            if (enabled) {
                log.addKeyValue(key, value);
            }
            return this;
        }

        public void end(Throwable throwable) {
            if (enabled) {
                if (throwable != null) {
                    log.log("span ended", throwable);
                } else {
                    log.log("span ended");
                }
            }
        }
    }
}
