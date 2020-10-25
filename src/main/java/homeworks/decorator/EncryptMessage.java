package homeworks.decorator;

public class EncryptMessage extends MessageDecorator implements MessageProcessor {

    public EncryptMessage(MessageProcessor messageProcessor) {
        super(messageProcessor);
    }

    public EncryptMessage() {
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Encrypted sending message");
        message.setText("#encryptSendingMessage");
        System.out.println(message);
    }

    @Override
    public void getMessage(Message message) {
        System.out.println("Encrypted getting message");
        message.setText("#encrypGettingMessage");
        System.out.println(message);

    }
}
