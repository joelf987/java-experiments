package org.jf.uni.week7;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut {
    public static void main(String[] args) {
        Path file = Paths.get("/home/joel/Projects/java/java-experiments/src/main/java/org/jf/uni/week7/greeting.txt");

        String s = "hello world";
        byte[] data = s.getBytes();

        try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch (Exception e){
            System.out.println("No such file");
        }
    }
}
