package messages.types;

import messages.Preset;
public class Text extends Preset {

    public Text() {
    }

    @Override
    public String encode() {
        return "encoding text message...\n";
    }

    @Override
    public String decode() {
        return "decoding text message...\n";
    }

    @Override
    public String encrypt() {
        return "encrypting text message...\n";
    }

    @Override
    public String decrypt() {
        return "decrypting text message...\n";
    }
}

