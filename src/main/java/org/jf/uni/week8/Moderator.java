package org.jf.uni.week8;

public class Moderator extends User{
    public Moderator(String name, MessageBoard board){
        super(name,board);
    }

    public void delete(){
        board.setNews("no news");
    }

    public void remove(Subscriber s){
        board.remove(s);
    }

    public void post(String news){
        super.post(news);
        System.out.println("Moderator has posted news");
    }
}
