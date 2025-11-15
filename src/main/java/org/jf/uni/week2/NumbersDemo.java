package org.jf.uni.week2;
import java.util.Scanner;


public class NumbersDemo {

    public static int displayTwiceTheNumber(int num){
        int s = num * 2;
        return s;
    }

    public static int displayNumPlusFive(int num){
        int u = num + 5;
        return u;
    }

    public static int displayNumSquared(int num){
        int v = num * num;
        return v;
    }


    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter an int");
        String input = inputDevice.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(displayTwiceTheNumber(num));
        System.out.println(displayNumPlusFive(num));
        System.out.println(displayNumSquared(num));

    }
}
