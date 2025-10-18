package org.jf.uni.week3;
import java.util.Scanner;

public class TwelveDays {
    private static final String MESSAGE = "On the %s day of Christmas, my true love sent to me\n%s";

    private static String getLyrics(int day){
        String result = "";
        switch (day){
            case 12:
                result += "Twelve drummers drumming, \n";
            case 11:
                result += "Eleven pipers piping, \n";
            case 10:
                result += "Ten lords a-leaping, \n";
            case 9:
                result += "Nine ladies dancing, \n";
            case 8:
                result += "Eight maids a-milking, \n";
            case 7:
                result += "Seven swans a-swimming, \n";
            case 6:
                result += "Six geese a-laying, \n";
            case 5:
                result += "Five gold rings, \n";
            case 4:
                result += "Four calling birds, \n";
            case 3:
                result += "Three French hens, \n";
            case 2:
                result += "Two turtle doves, And \n";
            case 1:
                result += "A partridge in a pear tree!";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner device = new Scanner(System.in);
        System.out.println("Enter the day you want for the lyrics");
        int day = device.nextInt();
        System.out.printf(MESSAGE, day, getLyrics(day));
    }

}
