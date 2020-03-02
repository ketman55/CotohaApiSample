
package com.lab.app.ketman.model.parse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "form",
    "kana",
    "lemma",
    "pos",
    "features",
    "dependency_labels",
    "attributes"
})
public class Token {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("form")
    private String form;
    @JsonProperty("kana")
    private String kana;
    @JsonProperty("lemma")
    private String lemma;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("features")
    private List<String> features = null;
    @JsonProperty("dependency_labels")
    private List<DependencyLabel> dependencyLabels = null;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    @JsonProperty("kana")
    public String getKana() {
        return kana;
    }

    @JsonProperty("kana")
    public void setKana(String kana) {
        this.kana = kana;
    }

    @JsonProperty("lemma")
    public String getLemma() {
        return lemma;
    }

    @JsonProperty("lemma")
    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("features")
    public List<String> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @JsonProperty("dependency_labels")
    public List<DependencyLabel> getDependencyLabels() {
        return dependencyLabels;
    }

    @JsonProperty("dependency_labels")
    public void setDependencyLabels(List<DependencyLabel> dependencyLabels) {
        this.dependencyLabels = dependencyLabels;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
