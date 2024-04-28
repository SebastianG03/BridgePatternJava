package messages.types;

import messages.Preset;

public class Image extends Preset {

    public Image() {
    }

    @Override
    public String encode() {
        return "encoding image message...\n";
    }

    @Override
    public String decode() {
        return "decoding image message...\n";
    }

    @Override
    public String encrypt() {
        return "encrypting image message...\n";
    }

    @Override
    public String decrypt() {
        return "decrypting image message...\n";
    }

}
