package messages;

public class Controller {
    private Preset messageInterface;

    public Controller(Preset messageInterface) {
        this.messageInterface = messageInterface;
    }

    public String getSender() {
        return messageInterface.getSender();
    }
    public Boolean sendMessage() {
        return messageInterface.sendMessage();
    }
    public String encrypt() {
        return messageInterface.encrypt();
    }
    public String decrypt() {
        return messageInterface.decrypt();
    }
    public String getReceiver() {
        return messageInterface.getReceiver();
    }
    public String getMessageDatetime() {
        return messageInterface.getMessageDatetime();
    }
}
