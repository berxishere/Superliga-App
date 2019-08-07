
package com.example.soccerapp.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StandingsResultDatum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("round_id")
    @Expose
    private Integer roundId;
    @SerializedName("round_name")
    @Expose
    private Integer roundName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("stage_name")
    @Expose
    private String stageName;
    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("standings")
    @Expose
    private Standings standings;

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

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public Integer getRoundName() {
        return roundName;
    }

    public void setRoundName(Integer roundName) {
        this.roundName = roundName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }

}
