package org.jf.uni.week2;
import java.util.Scanner;

public class FormLetterWriter {

    public void displaySalutation(String firstName, String p){
        p = p + "Dear" + firstName;
    }

    public void displaySalutation(String firstName, String lastName, String k){
        k = k + "Dear" + firstName + " " + lastName;
    }

    public static void main(String[] args) {
        
    }
}
