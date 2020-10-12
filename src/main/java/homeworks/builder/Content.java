package homeworks.builder;

public class Content {

    String body;

    String signature;

    public Content(String body, String signature) {
        this.body = body;
        this.signature = signature;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Content{" +
                "body='" + body + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
