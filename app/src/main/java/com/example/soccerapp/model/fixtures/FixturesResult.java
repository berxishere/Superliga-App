
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixturesResult {

    @SerializedName("data")
    @Expose
    private FixturesResultData data;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public FixturesResultData getData() {
        return data;
    }

    public void setData(FixturesResultData data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
