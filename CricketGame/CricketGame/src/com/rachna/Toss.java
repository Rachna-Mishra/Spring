package com.rachna;

import java.util.Random;

public class Toss {
    private static String Team1;
    private static String Team2;

    public Toss(String  Team1,String Team2)
    {
        this.Team1=Team1;
        this.Team2=Team2;
    }

    public String  getTeamWonToss()
    {
        Random r=GeneralUtils.getRandomFunction();
        if(r.nextInt(2)==0)
            return Team1;
        else
            return Team2;
    }

    public String tossForBattingOrBowling() {
        Random r=GeneralUtils.getRandomFunction();
        if(r.nextInt(2)==0)
            return "Batting";
        else
            return "Bowling";
    }
}
