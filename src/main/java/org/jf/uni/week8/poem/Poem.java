package org.jf.uni.week8.poem;

import java.util.Scanner;

public class Poem {
    private final String name;
    private final int lines;

    public Poem(String name, int lines) {
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", lines=" + lines +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i > 0 || i < 5;) {
            System.out.println("Enter a number from 1 to 4. 1 is a poem, 2 is a couplet, 3 is a haiku, 4 is a limerick.");
            i = scanner.nextInt();
            System.out.println("Enter the poem name");
            String name = scanner.next();
            Poem p = switch (i){
                case 1 -> createPoem(name, scanner);
                case 2 -> new Couplet(name);
                case 3 -> new Haiku(name);
                case 4 -> new Limerick(name);
                default -> null;
            };
            if (p != null){
                System.out.println(p);
                break;
            }
        }
    }

    private static Poem createPoem(String name, Scanner scanner){
        System.out.println("What is the number of lines in the poem?");
        int poemLines = scanner.nextInt();
        return new Poem(name, poemLines);
    }
}
