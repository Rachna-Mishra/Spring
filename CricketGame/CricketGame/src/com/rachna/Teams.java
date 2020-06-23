package com.rachna;

import java.util.Arrays;
import java.util.List;

public enum Teams {

    CSK(Arrays.asList("DHONI", "RAINA", "VIJAY", "MONU", "JADEJA")),
    KKR(Arrays.asList("DINESH", "ROBIN", "LYNN", "SUNIL", "PIYUSH")),
    MI(Arrays.asList("ROHIT", "SURYA", "RAHUL", "ADITYA", "ADAM")),
    RBC(Arrays.asList("VIRAT", "PARTHIV", "UMESH", "PAWAN", "SIRAJ"));

    private  List<String > playerList;
    private Teams(List<String> playerList)
    {
        this.playerList=playerList;
    }
    public List<String> getPlayerList()
    {
        return this.playerList;
    }
    public static void addPlayerDetails()
    {
        Teams[] teams = Teams.values();
        for (Teams team : teams) {
          List<String> players=team.getPlayerList();
          for(String playerName:players)
          {
            ScoreBoard.addDetail(playerName,team, PlayersDetail.PlayerType.BATSMAN,0,0,0);
          }
        }
    }

    public static List<String> retrivePlayerList(String teamPlaying) {
        Teams[] teams = Teams.values();
        for (Teams team : teams) {
            if (team.name().equalsIgnoreCase(teamPlaying))
                return team.getPlayerList();
        }
        return null;
    }

}
