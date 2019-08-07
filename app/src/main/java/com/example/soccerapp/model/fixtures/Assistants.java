
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Assistants {

    @SerializedName("first_assistant_id")
    @Expose
    private Object firstAssistantId;
    @SerializedName("second_assistant_id")
    @Expose
    private Object secondAssistantId;
    @SerializedName("fourth_official_id")
    @Expose
    private Object fourthOfficialId;

    public Object getFirstAssistantId() {
        return firstAssistantId;
    }

    public void setFirstAssistantId(Object firstAssistantId) {
        this.firstAssistantId = firstAssistantId;
    }

    public Object getSecondAssistantId() {
        return secondAssistantId;
    }

    public void setSecondAssistantId(Object secondAssistantId) {
        this.secondAssistantId = secondAssistantId;
    }

    public Object getFourthOfficialId() {
        return fourthOfficialId;
    }

    public void setFourthOfficialId(Object fourthOfficialId) {
        this.fourthOfficialId = fourthOfficialId;
    }

}
