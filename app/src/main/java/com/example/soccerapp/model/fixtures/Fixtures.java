
package com.example.soccerapp.model.fixtures;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fixtures {

    @SerializedName("data")
    @Expose
    private List<FixtureDatum> data = null;

    public List<FixtureDatum> getData() {
        return data;
    }

    public void setData(List<FixtureDatum> data) {
        this.data = data;
    }

}
