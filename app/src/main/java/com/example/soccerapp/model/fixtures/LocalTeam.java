
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalTeam {

    @SerializedName("data")
    @Expose
    private LocalTeamData data;

    public LocalTeamData getData() {
        return data;
    }

    public void setData(LocalTeamData data) {
        this.data = data;
    }

}
