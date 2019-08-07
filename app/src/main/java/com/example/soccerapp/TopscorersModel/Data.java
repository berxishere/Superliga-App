
package com.example.soccerapp.TopscorersModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("is_current_season")
    @Expose
    private Boolean isCurrentSeason;
    @SerializedName("current_round_id")
    @Expose
    private Integer currentRoundId;
    @SerializedName("current_stage_id")
    @Expose
    private Integer currentStageId;
    @SerializedName("goalscorers")
    @Expose
    private Goalscorers goalscorers;
    @SerializedName("assistscorers")
    @Expose
    private Assistscorers assistscorers;
    @SerializedName("cardscorers")
    @Expose
    private Cardscorers cardscorers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Boolean getIsCurrentSeason() {
        return isCurrentSeason;
    }

    public void setIsCurrentSeason(Boolean isCurrentSeason) {
        this.isCurrentSeason = isCurrentSeason;
    }

    public Integer getCurrentRoundId() {
        return currentRoundId;
    }

    public void setCurrentRoundId(Integer currentRoundId) {
        this.currentRoundId = currentRoundId;
    }

    public Integer getCurrentStageId() {
        return currentStageId;
    }

    public void setCurrentStageId(Integer currentStageId) {
        this.currentStageId = currentStageId;
    }

    public Goalscorers getGoalscorers() {
        return goalscorers;
    }

    public void setGoalscorers(Goalscorers goalscorers) {
        this.goalscorers = goalscorers;
    }

    public Assistscorers getAssistscorers() {
        return assistscorers;
    }

    public void setAssistscorers(Assistscorers assistscorers) {
        this.assistscorers = assistscorers;
    }

    public Cardscorers getCardscorers() {
        return cardscorers;
    }

    public void setCardscorers(Cardscorers cardscorers) {
        this.cardscorers = cardscorers;
    }

}
