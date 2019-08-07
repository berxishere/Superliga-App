
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisitorTeam {

    @SerializedName("data")
    @Expose
    private VisitorTeamData data;

    public VisitorTeamData getData() {
        return data;
    }

    public void setData(VisitorTeamData data) {
        this.data = data;
    }

}
