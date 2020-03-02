
package com.lab.app.ketman.model.sentencetype;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("modality")
    @Expose
    private String modality;
    @SerializedName("dialog_act")
    @Expose
    private List<String> dialogAct = null;

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public List<String> getDialogAct() {
        return dialogAct;
    }

    public void setDialogAct(List<String> dialogAct) {
        this.dialogAct = dialogAct;
    }

}
