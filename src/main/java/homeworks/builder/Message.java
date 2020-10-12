package homeworks.builder;

import java.util.Set;

public class Message {

    private String subject;

    private String from;

    private String to;

    private Set<String> toAll;

    private String copyTo;

    private Set<String> copyToAll;

    private Content content;

    public Message(String subject, String from, String to, Set<String> toAll, String copyTo, Set<String> copyToAll, Content content) {
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.toAll = toAll;
        this.copyTo = copyTo;
        this.copyToAll = copyToAll;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Set<String> getToAll() {
        return toAll;
    }

    public void setToAll(Set<String> toAll) {
        this.toAll = toAll;
    }

    public String getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(String copyTo) {
        this.copyTo = copyTo;
    }

    public Set<String> getCopyToAll() {
        return copyToAll;
    }

    public void setCopyToAll(Set<String> copyToAll) {
        this.copyToAll = copyToAll;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", toAll=" + toAll +
                ", copyTo='" + copyTo + '\'' +
                ", copyToAll=" + copyToAll +
                ", content=" + content +
                '}';
    }
}
