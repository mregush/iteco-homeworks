package homeworks.decorator;

public class DecryptMessage implements MessageProcessor {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Decrypt sending Message : ");
        message.setText("#decryptSendingMessage");
        System.out.println(message);
    }

    @Override
    public void getMessage(Message message) {
        System.out.println("Decrypt getting Message : ");
        message.setText("#decryptGettingMessage");
        System.out.println(message);
    }
}
