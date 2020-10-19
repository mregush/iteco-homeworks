package homeworks.decorator;

public abstract class MessageDecorator implements MessageProcessor {

    protected MessageProcessor messageProcessor;

    public MessageDecorator(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    @Override
    public void sendMessage(Message message) {
        messageProcessor.sendMessage(message);
    }

    @Override
    public void getMessage(Message message) {
        messageProcessor.getMessage(message);
    }
}
