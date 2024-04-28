package messages;

public abstract class Preset {
    String id;
    String sender;
    String receiver;
    String message;

    public abstract String getSender();
    public abstract Boolean sendMessage();
    public abstract String encrypt();
    public abstract String decrypt();
    public abstract String getReceiver();
    public abstract String getMessageDatetime();
}
