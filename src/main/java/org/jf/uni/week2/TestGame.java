package org.jf.uni.week2;
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Team team1 =TestTeam.setTeamData();
        Team team2 =TestTeam.setTeamData();
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter game time");
        String gameTime = inputDevice.nextLine();
        Game game = new Game(team1, team2, gameTime);
        System.out.println(game);
    }



}
