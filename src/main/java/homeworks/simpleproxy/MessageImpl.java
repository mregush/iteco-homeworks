package homeworks.simpleproxy;

public class MessageImpl implements MessageProcessor {

    @Override
    public void sendMessage(Message message) {
        message.setAddress("****");
        message.setAuthor("****");
        message.setText("#encryptedMessage");
    }
}
