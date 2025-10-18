package org.jf.uni.week2;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = inputDevice.nextLine();
        String t = s.toLowerCase();
        System.out.println(t);
        int n = s.length();
        System.out.println(n);
        String u = s.toUpperCase();
        System.out.println(u);

    }


}
