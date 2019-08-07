
package com.example.soccerapp.TopscorersModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goalscorers {

    @SerializedName("data")
    @Expose
    private List<GoalscorersDatum> data = null;

    public List<GoalscorersDatum> getData() {
        return data;
    }

    public void setData(List<GoalscorersDatum> data) {
        this.data = data;
    }

}
