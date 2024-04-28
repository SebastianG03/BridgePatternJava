package messages.types;

import Config.Encryptor;
import lombok.SneakyThrows;
import messages.Preset;

public class Text extends Preset {
    final Encryptor encryptor;
    final String publicKey;
    final String privateKey;

    @SneakyThrows
    public Text() {
        super.setContent("This is a non secret message. ;)\n");
        encryptor = new Encryptor();
        publicKey = encryptor.getPublicKeyString();
        privateKey = encryptor.getPrivateKeyString();

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
        return encryptor.encrypt(super.getContent(), publicKey);
    }

    @Override
    public String decrypt() {
        String message = encryptor.encrypt(super.getContent(), publicKey);
        return encryptor.decrypt(message, privateKey);
    }
}

