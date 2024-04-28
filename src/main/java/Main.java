import messages.types.Text;
import messages.Controller;

public class Main {
    public static void main(String[] args) {
        Text message = new Text();
        Controller controller = new Controller(message);

        System.out.println(message.decrypt());


    }
}
