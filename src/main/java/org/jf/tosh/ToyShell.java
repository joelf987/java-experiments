package org.jf.tosh;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToyShell {

    private static final String SCRIPT_FILE = "/tosh.groovy";

    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Welcome to Toy Shell");
        System.out.println("'Q' to quit");
        Binding sharedData = new Binding();

        String script = new BufferedReader(new InputStreamReader(ToyShell.class.getResourceAsStream(SCRIPT_FILE)))
                .lines()
                .collect(Collectors.joining("\n"));


        GroovyShell shell = new GroovyShell(sharedData);
        shell.evaluate(script);
        Scanner scanner = new Scanner(System.in);
        System.out.println(">");
        String line = "";
        for(; !line.trim().equals("Q");) {
            line = scanner.nextLine();
            System.out.println(shell.evaluate(line));
            System.out.println(">");
        }
    }
}
