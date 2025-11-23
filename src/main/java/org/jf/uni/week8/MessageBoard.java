package org.jf.uni.week8;

import java.util.ArrayList;

public class MessageBoard {
    private String news;
    private ArrayList<Subscriber> members;


    public MessageBoard() {
        this.news = "no news";
        members = new ArrayList<Subscriber>();
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        for(Subscriber m: members){
            m.alert();
        }
    }

    public void add(Subscriber m){
        members.add(m);
    }

    public void remove(Subscriber m){
        members.remove(m);
    }
}
