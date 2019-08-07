
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scores {

    @SerializedName("localteam_score")
    @Expose
    private Integer localteamScore;
    @SerializedName("visitorteam_score")
    @Expose
    private Integer visitorteamScore;
    @SerializedName("localteam_pen_score")
    @Expose
    private Object localteamPenScore;
    @SerializedName("visitorteam_pen_score")
    @Expose
    private Object visitorteamPenScore;
    @SerializedName("ht_score")
    @Expose
    private Object htScore;
    @SerializedName("ft_score")
    @Expose
    private Object ftScore;
    @SerializedName("et_score")
    @Expose
    private Object etScore;

    public Integer getLocalteamScore() {
        return localteamScore;
    }

    public void setLocalteamScore(Integer localteamScore) {
        this.localteamScore = localteamScore;
    }

    public Integer getVisitorteamScore() {
        return visitorteamScore;
    }

    public void setVisitorteamScore(Integer visitorteamScore) {
        this.visitorteamScore = visitorteamScore;
    }

    public Object getLocalteamPenScore() {
        return localteamPenScore;
    }

    public void setLocalteamPenScore(Object localteamPenScore) {
        this.localteamPenScore = localteamPenScore;
    }

    public Object getVisitorteamPenScore() {
        return visitorteamPenScore;
    }

    public void setVisitorteamPenScore(Object visitorteamPenScore) {
        this.visitorteamPenScore = visitorteamPenScore;
    }

    public Object getHtScore() {
        return htScore;
    }

    public void setHtScore(Object htScore) {
        this.htScore = htScore;
    }

    public Object getFtScore() {
        return ftScore;
    }

    public void setFtScore(Object ftScore) {
        this.ftScore = ftScore;
    }

    public Object getEtScore() {
        return etScore;
    }

    public void setEtScore(Object etScore) {
        this.etScore = etScore;
    }

}
