
package com.example.soccerapp.TopscorersModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Assistscorers {

    @SerializedName("data")
    @Expose
    private List<AssistscorersDatum> data = null;

    public List<AssistscorersDatum> getData() {
        return data;
    }

    public void setData(List<AssistscorersDatum> data) {
        this.data = data;
    }

}
