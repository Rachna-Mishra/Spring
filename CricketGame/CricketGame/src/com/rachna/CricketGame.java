package com.rachna;

import java.util.List;
import java.util.Scanner;

public class CricketGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Matches do you want to organise");
        int noOfMatches=sc.nextInt();
        while(noOfMatches-->0)
        {
            System.out.println("Enter number of overs for this match");
            int noOfOvers=sc.nextInt();

            System.out.println("Number of teams participating in this match range upto 4");
            int noOfTeams=sc.nextInt();

            // Selection Of Teams
            TeamsSelected ts=new TeamsSelected(noOfTeams);
            List<String> selectedTeams=ts.getSelectedTeams();

            System.out.println("-------------Match Started between Teams "+" "+selectedTeams.get(0)+" and "+selectedTeams.get(1)+"-----------------");

            //------------------Match Tossed between selected Teams--------------------
            Toss toss=new Toss(selectedTeams.get(0),selectedTeams.get(1));
            String tossWonTeamCode=toss.getTeamWonToss();
            String selectedTeamForBatting=selectedTeams.get(0);
            String selectedTeamForBowling=selectedTeams.get(1);
            System.out.println("------------Team "+tossWonTeamCode+" Won the Toss------------");

            String batOrBowl=toss.tossForBattingOrBowling();
            System.out.println("------------Team "+tossWonTeamCode+" Opted for "+batOrBowl+"---------------");

            if(tossWonTeamCode==selectedTeams.get(1))
            {
                if(batOrBowl.equalsIgnoreCase("Batting"))
                {
                    selectedTeamForBatting=selectedTeams.get(1);
                    selectedTeamForBowling=selectedTeams.get(0);
                }
                else
                {
                    selectedTeamForBatting=selectedTeams.get(0);
                    selectedTeamForBowling=selectedTeams.get(1);
                }
            }
            else
            {
                if(batOrBowl.equalsIgnoreCase("Bowling"))
                {
                    selectedTeamForBatting=selectedTeams.get(1);
                    selectedTeamForBowling=selectedTeams.get(0);
                }
            }
            //----------------------------Match Started-----------------
            System.out.println("----------Match Started---------------");
            MatchController m=new MatchController();
            Match match=new Match(noOfOvers);
            System.out.println(m.returnResult(match,selectedTeamForBatting,selectedTeamForBowling));
        }
    }
}
