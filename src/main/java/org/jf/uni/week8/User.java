package org.jf.uni.week8;

import java.util.Objects;

public class User implements Subscriber{
    protected String name;
    protected MessageBoard board;

    public User(String name, MessageBoard board) {
        this.name = name;
        this.board = board;
    }

    public static User anonymousUser(MessageBoard messageBoard) {
        return new User("Anonymous",messageBoard);
    }


    public void post(String news){
        post("", news);
    }

    public void post(String subject, String news){
        board.post(new Message(this, subject, news));
    }

    public void alert(){
        System.out.println("Alert for " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name) && Objects.equals(board, user.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, board);
    }
}
