package messages;

import lombok.Data;

@Data
public class Controller {
    private Preset message;

    public Controller(Preset message) {
        this.message = message;
    }

    public String sendMessage() {
        return message.encode() + message.encrypt();
    }
}
