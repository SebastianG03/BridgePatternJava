package messages.types;

import encryption.implementation.Encryption;
import lombok.SneakyThrows;
import messages.abstraction.Message;

public class Text extends Message {
    @SneakyThrows
    public Text(Encryption encryption) {
        content = "This is a text message";
        this.encryption = encryption;
    }

    @Override
    public void encrypt() {
        content = encryption.encrypt(content);
    }

    @Override
    public void decrypt() {
        content = encryption.decrypt(content);
    }
}

