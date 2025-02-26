// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.DocumentFormulaKind;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A formula object. */
@Fluent
public final class DocumentFormula {
    /*
     * Formula kind.
     */
    @JsonProperty(value = "kind", required = true)
    private DocumentFormulaKind kind;

    /*
     * LaTex expression describing the formula.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Bounding polygon of the formula.
     */
    @JsonProperty(value = "polygon")
    private List<Float> polygon;

    /*
     * Location of the formula in the reading order concatenated content.
     */
    @JsonProperty(value = "span", required = true)
    private DocumentSpan span;

    /*
     * Confidence of correctly extracting the formula.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Creates an instance of DocumentFormula class.
     *
     * @param kind the kind value to set.
     * @param value the value value to set.
     * @param span the span value to set.
     * @param confidence the confidence value to set.
     */
    @JsonCreator
    public DocumentFormula(
            @JsonProperty(value = "kind", required = true) DocumentFormulaKind kind,
            @JsonProperty(value = "value", required = true) String value,
            @JsonProperty(value = "span", required = true) DocumentSpan span,
            @JsonProperty(value = "confidence", required = true) float confidence) {
        this.kind = kind;
        this.value = value;
        this.span = span;
        this.confidence = confidence;
    }

    /**
     * Get the kind property: Formula kind.
     *
     * @return the kind value.
     */
    public DocumentFormulaKind getKind() {
        return this.kind;
    }

    /**
     * Get the value property: LaTex expression describing the formula.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Get the polygon property: Bounding polygon of the formula.
     *
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }

    /**
     * Set the polygon property: Bounding polygon of the formula.
     *
     * @param polygon the polygon value to set.
     * @return the DocumentFormula object itself.
     */
    public DocumentFormula setPolygon(List<Float> polygon) {
        this.polygon = polygon;
        return this;
    }

    /**
     * Get the span property: Location of the formula in the reading order concatenated content.
     *
     * @return the span value.
     */
    public DocumentSpan getSpan() {
        return this.span;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the formula.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }
}
