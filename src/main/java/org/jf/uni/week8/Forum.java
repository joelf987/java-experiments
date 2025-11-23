package org.jf.uni.week8;

public class Forum {
    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();
        User u1 = new User("Jane Austen", board);
        board.add(u1);
        User u2 = new User("Charles Dickens", board);
        board.add(u2);
        User u3 = new User("George Elliot", board);
        board.add(u3);
        Reader r = new Reader(123, board);
        board.add(r);

        Moderator admin = new Moderator("JF", board);
        board.add(admin);

        BoardManager manager = new BoardManager("WC", board);
        board.add(manager);


        u1.post("Pride and Prejudice just published!");
        System.out.println(board.getNews());

        admin.delete();
        System.out.println(board.getNews());
        admin.remove(u2);
        u3.post("Nearly finished writing Middlemarch");
        manager.delete();
        manager.remove(u1);

        admin.post("Removed 1 user");
    }
}
