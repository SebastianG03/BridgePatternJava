package encryption.implementation;

public interface Encryption {
    String encrypt(String message);
    String decrypt(String encryptedMessage);
}