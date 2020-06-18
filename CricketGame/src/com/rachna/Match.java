package com.rachna;

import java.util.Random;

public class Match {
    int noOfOvers;
    int noOfPlayers;

    Match(int noOfOvers)
    {
        this.noOfOvers=noOfOvers;
    }
    public int calculateScore()
    {
        int score = 0;
        noOfPlayers=11;
        for(int i=1;i<=noOfOvers*6;i++)
        {
            Random r=new Random();
            int run=r.nextInt(7);
            //System.out.println(run);
            if(run==3)
            {
                //System.out.println("Wicket");
                if(noOfPlayers!=0)
                    noOfPlayers--;
                else
                    break;
            }
            else
            score = score + run;
        }
        //System.out.println(noOfPlayers);
        return score;
    }

    public int totalWickets()
    {
        return 11-noOfPlayers;
    }
}
