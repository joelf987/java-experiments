package org.jf.uni.week7;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("/home/joel/Projects/java/java-experiments/src/main/java/org/jf/uni/week7/task1.txt");

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE, APPEND));

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            String s = "";
            while (!s.equals("QUIT")){
                System.out.println("Enter a string or QUIT");
                s = input.nextLine();
            }
            writer.write(s);
            writer.newLine();

            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("No such file");
        }

    }

}