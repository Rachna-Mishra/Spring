package com.rachna;

import java.util.Scanner;

public class CricketGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter number of overs for this match");
            int noOfOvers=sc.nextInt();
            System.out.println("Number of teams participating in this match");
            int noOfTeams=sc.nextInt();
            Toss toss=new Toss(noOfTeams);
            MatchController m=new MatchController();
            Match match=new Match(noOfOvers);
            System.out.println(m.returnResult(match));
        }
    }
}
