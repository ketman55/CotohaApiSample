
package com.lab.app.ketman.model.sentiment;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("sentiment")
    @Expose
    private String sentiment;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("emotional_phrase")
    @Expose
    private List<EmotionalPhrase> emotionalPhrase = null;

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<EmotionalPhrase> getEmotionalPhrase() {
        return emotionalPhrase;
    }

    public void setEmotionalPhrase(List<EmotionalPhrase> emotionalPhrase) {
        this.emotionalPhrase = emotionalPhrase;
    }

}
