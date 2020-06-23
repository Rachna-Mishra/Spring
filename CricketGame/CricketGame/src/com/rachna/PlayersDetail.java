package com.rachna;

public class PlayersDetail {

    public enum PlayerType
    {
        BATSMAN,BOWLER;
    }

    private String playerName;
    private Teams teamName;
    private  PlayersDetail.PlayerType playerType;
    private int totalBallsPlayed;
    private  int totalWicketsTaken;
    private int totalRunsScored;

    public int getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(int totalRunsScored) {
        this.totalRunsScored = totalRunsScored;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Teams getTeamName() {
        return teamName;
    }

    public void setTeamName(Teams teamName) {
        this.teamName = teamName;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getTotalWicketsTaken() {
        return totalWicketsTaken;
    }

    public void setTotalWicketsTaken(int totalWicketsTaken) {
        this.totalWicketsTaken = totalWicketsTaken;
    }
    public  String getUniquePlayer(PlayersDetail player)
    {
        return player.getTeamName().name()+"_"+player.getPlayerName();
    }

}
