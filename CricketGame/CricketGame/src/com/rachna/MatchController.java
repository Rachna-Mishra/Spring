package com.rachna;

public class MatchController {
    int team1score;
    int team2score;
    String result;
    Match match;
    int wickets1;
    int wickets2;

    public String returnResult(Match match,String  team1,String team2)
    {
        System.out.println("---------Team "+team1+" Ready for Batting----------------");
        team1score=match.calculateScore(team1);
        wickets1=match.getTotalWickets(team1);
        System.out.println("Total Wickets Of Team : "+wickets1);
        System.out.println();
        System.out.println("---------Now Team "+team2+" Ready for Batting----------------");
        team2score=match.calculateScore(team2);
        wickets2=match.getTotalWickets(team2);
        System.out.println("Total Wickets Of Team : "+wickets2);
        System.out.println();
        printScore(team1score,wickets1,team2score,wickets2);
        if(team1score>team2score)
            result= "---------Team 1 Won----------";
        else if(team1score<team2score)
            result= "---------Team 2 Won----------";
        else
            result= "---------Match Tie------------";
        return result;
    }
    public void printScore(int sc1,int w1,int sc2,int w2)
    {
        System.out.println();
        System.out.println();
      System.out.println("Team1 Score : "+sc1 +" " + "Total Wickets : "+w1);
      System.out.println("Team2 Score : "+sc2 +" " +"Total Wickets : "+w2);
    }
}
