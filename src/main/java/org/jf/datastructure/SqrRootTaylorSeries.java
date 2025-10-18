package org.jf.datastructure;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SqrRootTaylorSeries {
    private static int s;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        s = Integer.parseInt(in.nextLine());
        System.out.println(s);

        //approximate the sqrt
        int sqrt = s/2;
        System.out.println("Initial estimate: " + sqrt);

        Math.sqrt(s);


    }
}
