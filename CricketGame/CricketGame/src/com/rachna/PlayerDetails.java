package com.rachna;

import java.util.HashMap;
import java.util.Map;

public class PlayerDetails {

    public enum PlayerType
    {
        BATSMAN,BOWLER;
    }

    private Map<String,PlayerDetails> playerDetailsMap=new HashMap<>();
    private String playerName;
    private Teams teamName;
    private  PlayerType  playerType;
    private int totalBallsPlayed;
    private int totalWicketsTaken;
    private int totalScoredRuns;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setTeamName(Teams teamName) {
        this.teamName = teamName;
    }

    public Teams getTeamName() {
        return teamName;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public int getTotalScoredRuns() {
        return totalScoredRuns;
    }

    public void setTotalScoredRuns(int totalScoredRuns) {
        this.totalScoredRuns = totalScoredRuns;
    }

    public int getTotalWicketsTaken() {
        return totalWicketsTaken;
    }

    public void setTotalWicketsTaken(int totalWicketsTaken) {
        this.totalWicketsTaken = totalWicketsTaken;
    }

    PlayerDetails(String playerName, Teams teamName, PlayerType playerType, int totalBallsPlayed, int totalScoredRuns, int totalWicketsTaken) {
        this.playerName = playerName;
        this.teamName=teamName;
        this.playerType=playerType;
        this.totalBallsPlayed = totalBallsPlayed;
        this.totalScoredRuns=totalScoredRuns;
        this.totalWicketsTaken=totalWicketsTaken;
    }

    public String getUniquePlayer(PlayerDetails player)
    {
        return player.getTeamName()+"_"+player.getPlayerName();
    }

    public void updatePlayerDetails(String uniqueId,PlayerDetails player)
    {
        playerDetailsMap.put(uniqueId,player);
    }

}
