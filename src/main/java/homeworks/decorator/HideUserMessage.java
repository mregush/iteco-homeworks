package homeworks.decorator;

public class HideUserMessage implements MessageProcessor {


    @Override
    public void sendMessage(Message message) {
        System.out.println("Hide User sending message");
        message.setAddress("*****");
        message.setAuthor("*****");
        System.out.println(message);
    }

    @Override
    public void getMessage(Message message) {
        System.out.println("Hide User getting message");
        message.setAddress("*****");
        message.setAuthor("*****");
        System.out.println(message);
    }
}
