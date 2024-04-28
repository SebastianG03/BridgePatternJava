package messages;

import lombok.Data;

@Data
public class Controller {
    private Preset message;

    public Controller(Preset message) {
        this.message = message;
    }

    public String sendMessage() {
        return "The controller start sending a message...\n" +
                "1.Encoding...\n\t" + message.encode() +
                "2.Encrypting...\n\t" + message.encrypt() + "\n" +
                "The message was sent successfully\n";
    }

    public String receiveMessage() {
        return "The controller start receiving a message...\n" +
                "1.Decoding...\n\t" + message.decode() +
                "2.Decrypting...\n\t" + message.decrypt() +
                "The message was receipt successfully\n";
    }
}
