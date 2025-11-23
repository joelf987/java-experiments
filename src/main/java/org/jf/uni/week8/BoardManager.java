package org.jf.uni.week8;

public class BoardManager implements Subscriber{
    private String name;
    private MessageBoard board;

    public BoardManager(String name, MessageBoard board) {
        this.name = name;
        this.board = board;
    }

    public void alert(){
        System.out.println("Manager alert for " + name);
    }

    public void delete(){
        board.setNews("no news");
    }

    public void remove(Subscriber s){
        board.remove(s);
    }
}
