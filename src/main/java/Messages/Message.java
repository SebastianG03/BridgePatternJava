package Messages;

import java.util.Date;

public class Message extends MessageInterface {

    public Message() {
    }

    @Override
    public String getSender() {
        return "Sender";
    }

    @Override
    public Boolean sendMessage() {
        return true;
    }

    @Override
    public String encrypt() {
        return "fsdfs";
    }

    @Override
    public String decrypt() {
        return "fsfs";
    }

    @Override
    public String getReceiver() {
        return "fsdfs";
    }

    @Override
    public String getMessageDatetime() {
        return "fsdfs";
    }
}

