
package com.example.soccerapp.TopscorersModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardscorersDatum {

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("player_id")
    @Expose
    private Integer playerId;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("yellowcards")
    @Expose
    private Integer yellowcards;
    @SerializedName("redcards")
    @Expose
    private Integer redcards;
    @SerializedName("type")
    @Expose
    private String type;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getYellowcards() {
        return yellowcards;
    }

    public void setYellowcards(Integer yellowcards) {
        this.yellowcards = yellowcards;
    }

    public Integer getRedcards() {
        return redcards;
    }

    public void setRedcards(Integer redcards) {
        this.redcards = redcards;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
