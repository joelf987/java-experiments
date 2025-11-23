package org.jf.uni.week8;

public class Message {
    private final User user;
    private final String subject;
    private final String news;

    public Message(User user, String subject, String news) {
        this.user = user;
        this.subject = subject;
        this.news = news;
    }

    public User getUser() {
        return user;
    }

    public String getSubject() {
        return subject;
    }

    public String getNews() {
        return news;
    }

    public static Message anonymousMessage(String message, MessageBoard messageBoard) {

        return new Message(User.anonymousUser(messageBoard), "", message);
    }
}