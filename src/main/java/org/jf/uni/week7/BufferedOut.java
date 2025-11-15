package org.jf.uni.week7;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class BufferedOut {
    public static void main(String[] args) {
        Path file = Paths.get("/home/joel/Projects/java/java-experiments/src/main/java/org/jf/uni/week7/data.txt");

        String s1 = "hello";
        String s2 = "world";

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE, TRUNCATE_EXISTING));

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            writer.write(s1);
            writer.newLine();
            writer.write(s2);
            writer.newLine();

            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("No such file");
        }
    }
}
