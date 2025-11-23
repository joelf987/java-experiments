package org.jf.uni.week8;

public class User implements Subscriber{
    protected String name;
    protected MessageBoard board;

    public User(String name, MessageBoard board) {
        this.name = name;
        this.board = board;
    }



    public void post(String news){
        board.setNews(news);
    }

    public void alert(){
        System.out.println("Alert for " + name);
    }
}
