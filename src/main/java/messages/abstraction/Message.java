package messages.abstraction;

import encryption.implementation.Encryption;
import lombok.Data;
import java.util.Date;

@Data
public abstract class Message {
    String id;
    String sender;
    String receiver;
    protected String content;
    Date timeStamp;
    // Implementation
    protected Encryption encryption;

    public abstract void encrypt();
    public abstract void decrypt();

    @Override
    public String toString() {
        return content;
    }
}