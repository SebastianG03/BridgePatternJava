package messages.types;

import Config.Encryptor;
import lombok.SneakyThrows;
import messages.Preset;

import java.util.Base64;

public class Text extends Preset {
    final Encryptor encryptor;
    final String publicKey;
    final String privateKey;

    @SneakyThrows
    public Text() {
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
        String message = "This is an example of an encrypt message";
        return encryptor.encrypt(message, publicKey);
    }

    @Override
    public String decrypt() {
        String message = encryptor.encrypt("This is an example of a decrypted message", publicKey);
        return encryptor.decrypt(message, privateKey);
    }
}

