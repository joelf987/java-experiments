package org.jf.uni.week7;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class StudentOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("/home/joel/Projects/java/java-experiments/src/main/java/org/jf/uni/week7/students.txt");

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE, TRUNCATE_EXISTING));

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            int studentId = 0;
            String lastName = "";
            String grade = "";

            while (studentId >= 0){
                System.out.println("Enter the student id or -1 to quit");
                studentId = Integer.parseInt(input.nextLine());

                if (studentId >= 0){

                    System.out.println("Enter the student's lasts name");
                    lastName = input.nextLine();
                    System.out.println("Enter student grade");
                    grade = input.nextLine();

                    String s = studentId + "," + lastName + "," + grade;
                    writer.write(s);
                    writer.newLine();
                }

            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("No such file");
        }
    }
}
