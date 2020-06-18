package com.rachna;

public class MatchController {
    int team1score;
    int team2score;
    String result;
    Match match;
    int wickets1;
    int wickets2;

   /* MatchController(int noOfTeams)
    {
       this.noOfTeams=noOfTeams;
    }*/
    public String returnResult(Match match)
    {
        team1score=match.calculateScore();
        wickets1=match.totalWickets();
        team2score=match.calculateScore();
        wickets2=match.totalWickets();
        printScore(team1score,wickets1,team2score,wickets2);
        if(team1score>team2score)
            result= "Team 1 Won";
        else if(team1score<team2score)
            result="Team 2 Won";
        else
            result="Match Tie";
        return result;
    }

    public void printScore(int sc1,int w1,int sc2,int w2)
    {
      System.out.println("Team1 Score : "+sc1 +" " + "Total Wickets : "+w1);
      System.out.println("Team2 Score : "+sc2 +" " +"Total Wickets : "+w2);
    }
}
