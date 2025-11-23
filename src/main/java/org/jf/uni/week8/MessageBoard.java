package org.jf.uni.week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MessageBoard {
    private ArrayList<Message> messages;
    private ArrayList<Subscriber> members;


    public MessageBoard() {
        messages = new ArrayList<Message>();
        members = new ArrayList<Subscriber>();
    }

    public String getNews() {
        if (messages.isEmpty()){
            return "No news";
        } else {
            return messages.getLast().getNews();
        }

    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MessageBoard that)) return false;
        return Objects.equals(messages, that.messages) && Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, members);
    }

    public void add(Subscriber m){
        members.add(m);
    }

    public void remove(Subscriber m){
        members.remove(m);
        if (m instanceof User user){
            deleteByUser(user);
        }
    }

    public List findBySubject(String subject){
       return this.messages.stream()
               .filter(message -> message.getSubject().equals(subject))
               .toList();
    }

    public List findByUser(User user){
        return this.messages.stream()
                .filter(message -> message.getUser().equals(user))
                .toList();
    }

    public void post(Message message) {
        messages.add(message);
    }

    public void deleteLast() {
        messages.removeLast();
    }

    public void deleteByUser(User user) {
        messages.removeIf(message -> message.getUser().equals(user));
    }
}
