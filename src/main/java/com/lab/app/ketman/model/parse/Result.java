
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
    "chunk_info",
    "tokens"
})
public class Result {

    @JsonProperty("chunk_info")
    private ChunkInfo chunkInfo;
    @JsonProperty("tokens")
    private List<Token> tokens = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chunk_info")
    public ChunkInfo getChunkInfo() {
        return chunkInfo;
    }

    @JsonProperty("chunk_info")
    public void setChunkInfo(ChunkInfo chunkInfo) {
        this.chunkInfo = chunkInfo;
    }

    @JsonProperty("tokens")
    public List<Token> getTokens() {
        return tokens;
    }

    @JsonProperty("tokens")
    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
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
