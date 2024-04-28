package Messages;

public class Video extends MessageInterface {

    public Video() {
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public Boolean sendMessage() {
        return true;
    }

    @Override
    public String encrypt() {
        return "Encrypted Message";
    }

    @Override
    public String decrypt() {
        return "Decrypted Message";
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public String getMessageDatetime() {
        return "A date";
    }

}
