package messages.types;

import encryption.implementation.Encryption;
import messages.abstraction.Message;

public class Image extends Message {

    public Image(Encryption encryption) {
        content = "This is an image";
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
