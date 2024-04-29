import encryption.types.AES256Encryption;
import encryption.types.RSAEncryption;
import messages.abstraction.Message;
import messages.types.Image;
import messages.types.Text;

public class Main {
    public static void main(String[] args) throws Exception {
        Message[] messages = new Message[] {
            new Text(new RSAEncryption()), new Image(new AES256Encryption())
        };
        for (Message message : messages) {
            System.out.println("Mensaje:\t" + message); // Show the original message
            message.encrypt(); // Encrypt the message
            System.out.println("Mensaje encriptado:\t" + message);
            message.decrypt(); // Decrypt the message
            System.out.println("Mensaje desencriptado:\t" + message + "\n");
        }
    }
}