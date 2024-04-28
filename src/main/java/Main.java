import Messages.Message;
import Messages.MessageController;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        MessageController controller = new MessageController(message);

        System.out.println(message.decrypt());


    }
}
