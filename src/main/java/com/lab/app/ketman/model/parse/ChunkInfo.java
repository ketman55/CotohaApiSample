
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
    "head",
    "dep",
    "chunk_head",
    "chunk_func",
    "links",
    "predicate"
})
public class ChunkInfo {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("head")
    private Integer head;
    @JsonProperty("dep")
    private String dep;
    @JsonProperty("chunk_head")
    private Integer chunkHead;
    @JsonProperty("chunk_func")
    private Integer chunkFunc;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonProperty("predicate")
    private List<Object> predicate = null;
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

    @JsonProperty("head")
    public Integer getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(Integer head) {
        this.head = head;
    }

    @JsonProperty("dep")
    public String getDep() {
        return dep;
    }

    @JsonProperty("dep")
    public void setDep(String dep) {
        this.dep = dep;
    }

    @JsonProperty("chunk_head")
    public Integer getChunkHead() {
        return chunkHead;
    }

    @JsonProperty("chunk_head")
    public void setChunkHead(Integer chunkHead) {
        this.chunkHead = chunkHead;
    }

    @JsonProperty("chunk_func")
    public Integer getChunkFunc() {
        return chunkFunc;
    }

    @JsonProperty("chunk_func")
    public void setChunkFunc(Integer chunkFunc) {
        this.chunkFunc = chunkFunc;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonProperty("predicate")
    public List<Object> getPredicate() {
        return predicate;
    }

    @JsonProperty("predicate")
    public void setPredicate(List<Object> predicate) {
        this.predicate = predicate;
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
