package homeworks.simpleproxy;

public class Main {
    public static void main(String[] args) {
        MessageProcessor messageProxy = new MessageProxy();
        Message message = new Message();
        message.setAddress("Tom");
        message.setAuthor("Bob");
        message.setText("It's Message");
        System.out.println("Message without hide author and address and decrypted message");
        System.out.println(message);
        messageProxy.sendMessage(message);

    }
}
