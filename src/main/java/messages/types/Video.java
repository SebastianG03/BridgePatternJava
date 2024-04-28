package messages.types;

import messages.Preset;

public class Video extends Preset {

    public Video() {
    }

    @Override
    public String encode() {
        return "encoding video message...";
    }

    @Override
    public String decode() {
        return "decoding video message...";
    }

    @Override
    public String encrypt() {
        return "encrypting video message...";
    }

    @Override
    public String decrypt() {
        return "decrypting video message...";
    }
}
