
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coaches {

    @SerializedName("localteam_coach_id")
    @Expose
    private Integer localteamCoachId;
    @SerializedName("visitorteam_coach_id")
    @Expose
    private Integer visitorteamCoachId;

    public Integer getLocalteamCoachId() {
        return localteamCoachId;
    }

    public void setLocalteamCoachId(Integer localteamCoachId) {
        this.localteamCoachId = localteamCoachId;
    }

    public Integer getVisitorteamCoachId() {
        return visitorteamCoachId;
    }

    public void setVisitorteamCoachId(Integer visitorteamCoachId) {
        this.visitorteamCoachId = visitorteamCoachId;
    }

}
