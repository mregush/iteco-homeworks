package homeworks.decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new Message(new HideUserMessage());
        message.setText("It's  message");
        message.setAuthor("Tom");
        message.setAddress("Bob");
        message.sendMessage(message);
        message.getMessage(message);

        Message encrypt = new Message(new EncryptMessage(new HideUserMessage()));
        encrypt.setAuthor("Tom");
        encrypt.setAddress("Bob");
        encrypt.setText("It's  message");
        encrypt.sendMessage(encrypt);
        encrypt.getMessage(encrypt);

        Message decrypt = new Message(new DecryptMessage());
        decrypt.setAuthor("Tom");
        decrypt.setAddress("Bob");
        decrypt.setText("It's  message");
        decrypt.sendMessage(decrypt);
        decrypt.getMessage(decrypt);
    }
}
