package messages.types;

import messages.Preset;

public class Image extends Preset {

    public Image() {
    }

    @Override
    public String encode() {
        return "encoding image message...";
    }

    @Override
    public String decode() {
        return "decoding image message...";
    }

    @Override
    public String encrypt() {
        return "encrypting image message...";
    }

    @Override
    public String decrypt() {
        return "decrypting image message...";
    }

}
