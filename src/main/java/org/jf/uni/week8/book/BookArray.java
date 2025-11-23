package org.jf.uni.week8.book;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < books.length; i++){
            System.out.println("Enter whether book is nonfiction or fiction, N/F");
            String s = scanner.nextLine();
            if (s.toUpperCase().equals( "N")){
                System.out.println("Enter the name of the book");
                String title = scanner.nextLine();
                books[i] = new NonFiction(title);
            } else {
                System.out.println("Enter the name of the book");
                String title = scanner.nextLine();
                books[i] = new Fiction(title);
            }
        }
        for (Book b : books){
            System.out.println(b);
        }
    }
}
