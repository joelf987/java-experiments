package org.jf.uni.week7;

public class SplitTest {
    public static void main(String[] args) {
        String s = "543,Woolf,C";
        String[] array = new String[3];
        array = s.split(",");

        for (int i = 0; i <3; i ++){
            System.out.println(array[i]);
        }
    }
}
