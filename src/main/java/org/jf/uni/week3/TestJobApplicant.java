package org.jf.uni.week3;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestJobApplicant {
    private static JobApplicant createJobApplicant(){
        Scanner device = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = device.nextLine();
        System.out.println("Enter the phone number");
        String phoneNum = device.nextLine();
        System.out.println("Has word processing");
        boolean wordProcessing = device.nextInt() > 0;
        System.out.println("Has spreadsheet");
        boolean spreadsheet = device.nextInt() > 0;
        System.out.println("Has database");
        boolean database = device.nextInt() > 0;
        System.out.println("Has graphics");
        boolean graphics = device.nextInt() > 0;

        return new JobApplicant(name, phoneNum, wordProcessing,spreadsheet, database, graphics);
    }

    private static void checkQualifications(JobApplicant jobApplicant){
        int i = jobApplicant.isDatabases() ? 1 : 0;
        int j = jobApplicant.isGraphics() ? 1 : 0;
        int k = jobApplicant.isSpreadsheets() ? 1 : 0;
        int l = jobApplicant.isWordProcessing() ? 1 : 0;
        String message = "Name: %s \n Phone: %s \n Qualified: %s";
        if ((i + j + k + l) >= 3){
            System.out.println(message.formatted(jobApplicant.getName(), jobApplicant.getPhoneNum(), "yes"));
        }else{
            System.out.println(message.formatted(jobApplicant.getName(), jobApplicant.getPhoneNum(), "no"));
        }

    }

    public static void main(String[] args) {
        JobApplicant jb1 = createJobApplicant();
        JobApplicant jb2 = createJobApplicant();
        JobApplicant jb3 = createJobApplicant();

        Stream.of(jb1, jb2, jb3)
                .forEach(TestJobApplicant::checkQualifications);




    }
}
