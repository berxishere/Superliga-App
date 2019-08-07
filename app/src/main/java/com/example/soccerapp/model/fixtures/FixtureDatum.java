
package com.example.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixtureDatum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("round_id")
    @Expose
    private Integer roundId;
    @SerializedName("group_id")
    @Expose
    private Object groupId;
    @SerializedName("aggregate_id")
    @Expose
    private Object aggregateId;
    @SerializedName("venue_id")
    @Expose
    private Integer venueId;
    @SerializedName("referee_id")
    @Expose
    private Object refereeId;
    @SerializedName("localteam_id")
    @Expose
    private Integer localteamId;
    @SerializedName("visitorteam_id")
    @Expose
    private Integer visitorteamId;
    @SerializedName("winner_team_id")
    @Expose
    private Object winnerTeamId;
    @SerializedName("weather_report")
    @Expose
    private Object weatherReport;
    @SerializedName("commentaries")
    @Expose
    private Boolean commentaries;
    @SerializedName("attendance")
    @Expose
    private Object attendance;
    @SerializedName("pitch")
    @Expose
    private Object pitch;
    @SerializedName("details")
    @Expose
    private Object details;
    @SerializedName("neutral_venue")
    @Expose
    private Boolean neutralVenue;
    @SerializedName("winning_odds_calculated")
    @Expose
    private Boolean winningOddsCalculated;
    @SerializedName("formations")
    @Expose
    private Formations formations;
    @SerializedName("scores")
    @Expose
    private Scores scores;
    @SerializedName("time")
    @Expose
    private Time time;
    @SerializedName("coaches")
    @Expose
    private Coaches coaches;
    @SerializedName("standings")
    @Expose
    private Standings standings;
    @SerializedName("assistants")
    @Expose
    private Assistants assistants;
    @SerializedName("leg")
    @Expose
    private String leg;
    @SerializedName("colors")
    @Expose
    private Object colors;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("localTeam")
    @Expose
    private LocalTeam localTeam;
    @SerializedName("visitorTeam")
    @Expose
    private VisitorTeam visitorTeam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getAggregateId() {
        return aggregateId;
    }

    public void setAggregateId(Object aggregateId) {
        this.aggregateId = aggregateId;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Object getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Object refereeId) {
        this.refereeId = refereeId;
    }

    public Integer getLocalteamId() {
        return localteamId;
    }

    public void setLocalteamId(Integer localteamId) {
        this.localteamId = localteamId;
    }

    public Integer getVisitorteamId() {
        return visitorteamId;
    }

    public void setVisitorteamId(Integer visitorteamId) {
        this.visitorteamId = visitorteamId;
    }

    public Object getWinnerTeamId() {
        return winnerTeamId;
    }

    public void setWinnerTeamId(Object winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }

    public Object getWeatherReport() {
        return weatherReport;
    }

    public void setWeatherReport(Object weatherReport) {
        this.weatherReport = weatherReport;
    }

    public Boolean getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(Boolean commentaries) {
        this.commentaries = commentaries;
    }

    public Object getAttendance() {
        return attendance;
    }

    public void setAttendance(Object attendance) {
        this.attendance = attendance;
    }

    public Object getPitch() {
        return pitch;
    }

    public void setPitch(Object pitch) {
        this.pitch = pitch;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Boolean getNeutralVenue() {
        return neutralVenue;
    }

    public void setNeutralVenue(Boolean neutralVenue) {
        this.neutralVenue = neutralVenue;
    }

    public Boolean getWinningOddsCalculated() {
        return winningOddsCalculated;
    }

    public void setWinningOddsCalculated(Boolean winningOddsCalculated) {
        this.winningOddsCalculated = winningOddsCalculated;
    }

    public Formations getFormations() {
        return formations;
    }

    public void setFormations(Formations formations) {
        this.formations = formations;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Coaches getCoaches() {
        return coaches;
    }

    public void setCoaches(Coaches coaches) {
        this.coaches = coaches;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }

    public Assistants getAssistants() {
        return assistants;
    }

    public void setAssistants(Assistants assistants) {
        this.assistants = assistants;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public Object getColors() {
        return colors;
    }

    public void setColors(Object colors) {
        this.colors = colors;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public LocalTeam getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(LocalTeam localTeam) {
        this.localTeam = localTeam;
    }

    public VisitorTeam getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(VisitorTeam visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

}
