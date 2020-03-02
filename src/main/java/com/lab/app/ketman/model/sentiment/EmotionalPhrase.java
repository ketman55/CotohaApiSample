
package com.lab.app.ketman.model.sentiment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmotionalPhrase {

    @SerializedName("form")
    @Expose
    private String form;
    @SerializedName("emotion")
    @Expose
    private String emotion;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

}
