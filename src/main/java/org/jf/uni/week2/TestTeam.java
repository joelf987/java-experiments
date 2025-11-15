package org.jf.uni.week2;
import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);



    }

    static Team setTeamData() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter high school name");
        String highSchoolName = inputDevice.nextLine();
        System.out.println("Enter sport");
        String sport = inputDevice.nextLine();
        System.out.println("Enter team name");
        String teamName = inputDevice.nextLine();

        return new Team(highSchoolName, sport, teamName);
    }
}
