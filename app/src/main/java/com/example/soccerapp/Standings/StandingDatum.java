
package com.example.soccerapp.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StandingDatum {

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("round_id")
    @Expose
    private Integer roundId;
    @SerializedName("round_name")
    @Expose
    private Integer roundName;
    @SerializedName("group_id")
    @Expose
    private Object groupId;
    @SerializedName("group_name")
    @Expose
    private Object groupName;
    @SerializedName("overall")
    @Expose
    private Overall overall;
    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("away")
    @Expose
    private Away away;
    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("recent_form")
    @Expose
    private String recentForm;
    @SerializedName("status")
    @Expose
    private Object status;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getGroupName() {
        return groupName;
    }

    public void setGroupName(Object groupName) {
        this.groupName = groupName;
    }

    public Overall getOverall() {
        return overall;
    }

    public void setOverall(Overall overall) {
        this.overall = overall;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getRecentForm() {
        return recentForm;
    }

    public void setRecentForm(String recentForm) {
        this.recentForm = recentForm;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

}
