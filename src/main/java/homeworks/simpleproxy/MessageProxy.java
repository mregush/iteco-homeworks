package homeworks.simpleproxy;

public class MessageProxy implements MessageProcessor {

    private static MessageProcessor messageProcessor;

    @Override
    public void sendMessage(Message message) {
        if (messageProcessor == null) {
            messageProcessor = new MessageImpl();
        }
        System.out.println("Author and Address was hide from user, and text was encrypted");
        messageProcessor.sendMessage(message);
        System.out.println(message);
    }
}
