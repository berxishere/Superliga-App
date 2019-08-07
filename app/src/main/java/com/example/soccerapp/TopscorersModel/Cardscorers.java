
package com.example.soccerapp.TopscorersModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cardscorers {

    @SerializedName("data")
    @Expose
    private List<CardscorersDatum> data = null;

    public List<CardscorersDatum> getData() {
        return data;
    }

    public void setData(List<CardscorersDatum> data) {
        this.data = data;
    }

}
