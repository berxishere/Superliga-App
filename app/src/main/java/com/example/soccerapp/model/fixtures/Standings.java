
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standings {

    @SerializedName("localteam_position")
    @Expose
    private Object localteamPosition;
    @SerializedName("visitorteam_position")
    @Expose
    private Object visitorteamPosition;

    public Object getLocalteamPosition() {
        return localteamPosition;
    }

    public void setLocalteamPosition(Object localteamPosition) {
        this.localteamPosition = localteamPosition;
    }

    public Object getVisitorteamPosition() {
        return visitorteamPosition;
    }

    public void setVisitorteamPosition(Object visitorteamPosition) {
        this.visitorteamPosition = visitorteamPosition;
    }

}
