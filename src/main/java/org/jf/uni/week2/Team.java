package org.jf.uni.week2;

public class Team {
    private String highSchoolName;
    private String sport;
    private String teamName;

    public Team(String highSchoolName, String sport, String teamName) {
        this.highSchoolName = highSchoolName;
        this.sport = sport;
        this.teamName = teamName;
    }


    public String getHighSchoolName() {
        return highSchoolName;
    }

    public String getSport() {
        return sport;
    }

    public String getTeamName() {
        return teamName;
    }

    public final static String motto(){
        return "Sportsmanship!";
    }

    @Override
    public String toString() {
        return "Team{" +
                "highSchoolName='" + highSchoolName + '\'' +
                ", sport='" + sport + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
