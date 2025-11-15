package org.jf.uni.week2;

public class Game {
    private Team teamA;
    private Team teamB;
    private String gameTime;

    public Game(Team teamA, Team teamB, String gameTime) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.gameTime = gameTime;
    }

    public String getGameTime() {
        return gameTime;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    @Override
    public String toString() {
        return "Game{" +
                "teamA=" + teamA +
                ", teamB=" + teamB +
                ", gameTime='" + gameTime + '\'' +
                '}';
    }
}
