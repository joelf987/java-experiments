package org.jf.uni.week8;

public class Reader implements Subscriber {
    private int id;
    private MessageBoard board;

    public Reader(int id, MessageBoard board) {
        this.id = id;
        this.board = board;
    }

    public void alert(){
        System.out.println("Alert for anonymous " + id);
    }
}
