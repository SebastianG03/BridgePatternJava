package messages.types;

import messages.Preset;

public class Video extends Preset {

    public Video() {
    }

    @Override
    public String encode() {
        return "encoding video message...\n";
    }

    @Override
    public String decode() {
        return "decoding video message...\n";
    }

    @Override
    public String encrypt() {
        return "encrypting video message...\n";
    }

    @Override
    public String decrypt() {
        return "decrypting video message...\n";
    }
}
