package org.jf.uni.week3;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int");
        int x = input.nextInt();
        input.nextLine();

        if ((x > 0) || (x%2 == 0)) {
            System.out.println(x + " is positive or even");
        }
        else {
            System.out.println(x + " is not positive and not even");
        }

        boolean b = ((x%2 == 0) && (x>0));
        System.out.println(b);
    }
}