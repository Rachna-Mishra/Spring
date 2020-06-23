package com.rachna;

import java.util.List;
import java.util.Random;

public class Match {
    private static int noOfOvers;
    private static int totalWicketsOfTeam;
    private static String currentPlayerOnStrike;
    private static String currentPlayerOnPitch;
    private static int totalScoreOfPLayerOnStrike=0;
    private static int totalScoreOfPlayerOnPitch=0;
    private static int totalBallsPlayed=0;

    Match(int noOfOvers) {
        this.noOfOvers = noOfOvers;
    }

    public int calculateScore(String teamPlaying) {
        List<String> playerList = Teams.retrivePlayerList(teamPlaying);
        int sequenceNo = 0;
        currentPlayerOnStrike = playerList.get(sequenceNo++);
        currentPlayerOnPitch = playerList.get(sequenceNo++);
        int score = 0;
        totalWicketsOfTeam = 0;
        totalScoreOfPLayerOnStrike=0;
        totalScoreOfPlayerOnPitch=0;
        totalBallsPlayed=0;
        for (int i = 1; i <= noOfOvers * 6; i++) {
            Random r = GeneralUtils.getRandomFunction();
            int run = r.nextInt(8);
            switch (run) {
                case 0:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    score += run;
                    break;
                case 1:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    Match.swapPlayersPosition();
                    score += run;
                    break;
                case 2:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    score += run;
                    break;
                case 3:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    Match.swapPlayersPosition();
                    score += run;
                    break;
                case 4:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    score += run;
                    break;
                case 5:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    score += run;
                    break;
                case 6:
                    System.out.println(currentPlayerOnStrike + " Player is on Strike");
                    score += run;
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!--------------Wicket---------------!!!!!!!!!!! ");
                    totalWicketsOfTeam++;
                    if (sequenceNo < playerList.size())
                        currentPlayerOnStrike = playerList.get(sequenceNo++);
            }
            System.out.println("Current Score : "+score);
            if (sequenceNo >= playerList.size()) {
                System.out.println("Inning Over : No remaining players are left in the team");
                break;
            }
            if(run!=7)
            totalScoreOfPLayer+=run;
            else
            {
               // PlayersDetail playerUpdate=new PlayersDetail();
                Teams team=Teams.valueOf(teamPlaying);
                ScoreBoard.addDetail(currentPlayerOnStrike,team, PlayersDetail.PlayerType.BATSMAN,totalScoreOfPLayer,0,totalBallsPlayed);
                totalScoreOfPLayer=0;
                totalBallsPlayed=0;
            }
        }
        Teams team=Teams.valueOf(teamPlaying);
        ScoreBoard.addDetail(currentPlayerOnStrike,team, PlayersDetail.PlayerType.BATSMAN,totalScoreOfPLayer,0,totalBallsPlayed);
        ScoreBoard.addDetail(currentPlayerOnPitch,team, PlayersDetail.PlayerType.BATSMAN,totalScoreOfPLayer,0,totalBallsPlayed);

        return score;
    }

    public int getTotalWickets(String team) {
        return totalWicketsOfTeam;
    }

    public static void swapPlayersPosition() {
        String temp = currentPlayerOnStrike;
        currentPlayerOnStrike=currentPlayerOnPitch;
        currentPlayerOnPitch= temp;
    }
}
