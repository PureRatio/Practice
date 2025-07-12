package ThirteenthDay;

import java.util.Date;

public class Message {
    User sender;
    User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() { return receiver; }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\nTO: " + this.receiver + "\nON: " + date + "\n" + this.text + "\n";
    }
}
