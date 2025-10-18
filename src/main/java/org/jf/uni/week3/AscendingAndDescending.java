package org.jf.uni.week3;
import java.util.Scanner;

public class AscendingAndDescending {
    private int num1;
    private int num2;
    private int num3;


    int[] sort = {};

    public void ascending(){
        if(num1 > num2){
            sort = new int[]{num1, num2};
        }
        else{
            sort = new int[]{num2, num1};
        }
        if (num3 > sort[0]) {
            if (num3>sort[1]) {
                num3 = sort[2];
            }
            else {
                num3 = sort[1];
            }
        }
            else{
                num3 = sort[0];
            }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd num");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd num");
        int num3 = scanner.nextInt();


    }



}
