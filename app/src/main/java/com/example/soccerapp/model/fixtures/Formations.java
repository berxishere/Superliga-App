
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Formations {

    @SerializedName("localteam_formation")
    @Expose
    private Object localteamFormation;
    @SerializedName("visitorteam_formation")
    @Expose
    private Object visitorteamFormation;

    public Object getLocalteamFormation() {
        return localteamFormation;
    }

    public void setLocalteamFormation(Object localteamFormation) {
        this.localteamFormation = localteamFormation;
    }

    public Object getVisitorteamFormation() {
        return visitorteamFormation;
    }

    public void setVisitorteamFormation(Object visitorteamFormation) {
        this.visitorteamFormation = visitorteamFormation;
    }

}
