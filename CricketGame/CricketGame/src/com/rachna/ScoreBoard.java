package com.rachna;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ScoreBoard {
    private static Map<String,PlayersDetail> playerDetailsMap=new LinkedHashMap<>();
    public static void addDetail(String playerName, Teams teamName, PlayersDetail.PlayerType playerType,int totalRunsScored,int totalWicketsTaken,int totalBallsPlayed)
    {
        PlayersDetail newPlayer=new PlayersDetail();
        newPlayer.setPlayerName(playerName);
        newPlayer.setTeamName(teamName);
        newPlayer.setPlayerType(playerType);
        newPlayer.setTotalBallsPlayed(totalBallsPlayed);
        newPlayer.setTotalWicketsTaken(totalWicketsTaken);
        newPlayer.setTotalRunsScored(totalRunsScored);
        String key=newPlayer.getUniquePlayer(newPlayer);
            playerDetailsMap.put(key,newPlayer);
            displayPlayerRecord(key);
    }
    public static void displayScoreBoard(String team1,String team2)
    {
        ScoreBoard.show(team1);
        ScoreBoard.show(team2);
    }
    public static void show(String team)
    {
        List<String> playerList=Teams.retrivePlayerList(team);
        for( String playerName:playerList)
        {
          displayPlayerRecord(team+"_"+playerName);
        }
    }
    public static void displayPlayerRecord(String key)
    {
        PlayersDetail playerDetails =playerDetailsMap.get(key);

        System.out.println(playerDetails.getTeamName() + " "
                + playerDetails.getPlayerName() + " "
                + playerDetails.getPlayerType() + " "
                + playerDetails.getTotalBallsPlayed() + " "
                + playerDetails.getTotalRunsScored() + " "
                +playerDetails.getTotalWicketsTaken());
    }
}
