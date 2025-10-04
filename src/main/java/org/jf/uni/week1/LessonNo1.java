package org.jf.uni.week1;

import java.util.Scanner;
import java.time.Period;

public class LessonNo1 {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = inputDevice.nextLine();

        System.out.println("Enter your middle name");
        String middle = inputDevice.nextLine();

        System.out.println("Enter your last name");
        String last = inputDevice.nextLine();

        System.out.println(first + " " + middle + " " + last);

        System.out.println("Enter your age");
        int age = inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.println("You are " + age + " years old");

        System.out.println("Enter a number");
        int years = inputDevice.nextInt();
        int newAge = age + years;
        System.out.println("You will be " + newAge + " years old in " + years + " years time");

        System.out.println("Enter a number");
        double num1 = inputDevice.nextDouble();

        System.out.println("Enter a number");
        double num2 = inputDevice.nextDouble();


        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;


        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);


        System.out.println("Enter a number");
        int x = inputDevice.nextInt();
        System.out.println("Enter a number");
        int y = inputDevice.nextInt();
        System.out.println("Enter a number");
        int z = inputDevice.nextInt();
        String year = Integer.toString(x);
        String month = Integer.toString(y);
        String day = Integer.toString(z);

        String time = "P" + year + "Y" + month + "M" + day + "D";
        Period p = Period.parse(time);
        System.out.println("The year is " + p.getYears());
        System.out.println("The month is " + p.getMonths());
        System.out.println("The day is " + p.getDays());
    }

}

