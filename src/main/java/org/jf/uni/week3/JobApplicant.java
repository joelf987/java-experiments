package org.jf.uni.week3;

public class JobApplicant {
    private final String name;
    private final String phoneNum;
    private final boolean wordProcessing;
    private final boolean spreadsheets;
    private final boolean databases;
    private final boolean graphics;

    public JobApplicant(String name, String phoneNum, boolean wordProcessing, boolean spreadsheets, boolean databases, boolean graphics) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.wordProcessing = wordProcessing;
        this.spreadsheets = spreadsheets;
        this.databases = databases;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public boolean isSpreadsheets() {
        return spreadsheets;
    }

    public boolean isWordProcessing() {
        return wordProcessing;
    }

    public boolean isDatabases() {
        return databases;
    }

    public boolean isGraphics() {
        return graphics;
    }


}
