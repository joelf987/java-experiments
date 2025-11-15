package org.jf.uni.week7;
import java.nio.file.*;
import java.io.*;

public class StudentIn {
    public static void main(String[] args) {
        Path file = Paths.get("/home/joel/Projects/java/java-experiments/src/main/java/org/jf/uni/week7/students.txt");
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String s = reader.readLine();
            while (s != null){
                String[] array = new String[3];
                array = s.split(",");
                for (int i = 0; i <3; i ++){
                    System.out.println(array[i]);

                }
                s = reader.readLine();
            }
            reader.close();
        } catch (Exception e){
            System.out.println("No such file");
        }
    }
}
