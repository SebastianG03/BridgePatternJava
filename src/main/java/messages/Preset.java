package messages;

import Config.Encryptor;
import lombok.Data;
import java.util.Date;

@Data
public abstract class Preset {
    String id;
    String sender;
    String receiver;
    String content;
    Date timeStamp;


    public abstract String encode();
    public abstract String decode();
    public abstract String encrypt();
    public abstract String decrypt();
}
