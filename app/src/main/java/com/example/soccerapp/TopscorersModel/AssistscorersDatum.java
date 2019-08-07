
package com.example.soccerapp.TopscorersModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssistscorersDatum {

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
    @SerializedName("assists")
    @Expose
    private Integer assists;
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

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
