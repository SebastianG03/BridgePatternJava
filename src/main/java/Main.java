import messages.Preset;
import messages.types.Image;
import messages.types.Text;
import messages.Controller;
import messages.types.Video;

public class Main {
    public static void main(String[] args) {
        Preset[] messages = new Preset[] {
            new Text(), new Image(), new Video()
        };
        for (Preset preset : messages) {
            Controller controller = new Controller(preset);
            System.out.println(controller.sendMessage());
            System.out.println(controller.receiveMessage());
        }
    }
}