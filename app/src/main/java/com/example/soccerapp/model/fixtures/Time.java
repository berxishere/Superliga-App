
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("starting_at")
    @Expose
    private StartingAt startingAt;
    @SerializedName("minute")
    @Expose
    private Object minute;
    @SerializedName("second")
    @Expose
    private Object second;
    @SerializedName("added_time")
    @Expose
    private Object addedTime;
    @SerializedName("extra_minute")
    @Expose
    private Object extraMinute;
    @SerializedName("injury_time")
    @Expose
    private Object injuryTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StartingAt getStartingAt() {
        return startingAt;
    }

    public void setStartingAt(StartingAt startingAt) {
        this.startingAt = startingAt;
    }

    public Object getMinute() {
        return minute;
    }

    public void setMinute(Object minute) {
        this.minute = minute;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public Object getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Object addedTime) {
        this.addedTime = addedTime;
    }

    public Object getExtraMinute() {
        return extraMinute;
    }

    public void setExtraMinute(Object extraMinute) {
        this.extraMinute = extraMinute;
    }

    public Object getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(Object injuryTime) {
        this.injuryTime = injuryTime;
    }

}
