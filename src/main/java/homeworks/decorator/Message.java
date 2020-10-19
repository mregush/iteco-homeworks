package homeworks.decorator;

public class Message extends MessageDecorator {

    private String author;

    private String address;

    private String text;

    public Message(MessageProcessor messageProcessor) {
        super(messageProcessor);
    }

    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);
    }

    @Override
    public void getMessage(Message message) {
        super.getMessage(message);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", address='" + address + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
