package org.jf.uni.week4;
import java.util.Random;

public class Starter {
    public static void main(String[] args) {
        Random generator = new Random();
        double r = generator.nextDouble();
        System.out.println(r);

        int count = 0;

        boolean[] data = new boolean[100];

        for (int i = 0; i < 100; i++){
            if(r < 0.25){
                count++;
                data[i] = true;
            }
            else {
                data[i] = false;
            }
            r = generator.nextDouble();
        }
        System.out.println(count);
        for (int j = 0; j < 99; j++){
            System.out.println(data[j]);
        }

//        while(r >= 0.25){
//            System.out.println(r);
//            System.out.println("test fail");
//            count++;
//            r = generator.nextDouble();
//        }
//
//        System.out.println("Success after " + count);

    }

}
