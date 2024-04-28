package messages.types;

import messages.Preset;

public class Text extends Preset {

    public Text() {
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

