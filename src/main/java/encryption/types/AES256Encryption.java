package encryption.types;

import encryption.implementation.Encryption;

public class AES256Encryption implements Encryption {

    @Override
    public String encrypt(String message) {
        return "Encrypted with AES256 Encryption";
    }

    @Override
    public String decrypt(String encryptedMessage) {
        return "Decrypted with AES256 Encryption";
    }
}
