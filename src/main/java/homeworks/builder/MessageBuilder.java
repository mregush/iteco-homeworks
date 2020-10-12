package homeworks.builder;

import java.util.Set;

public class MessageBuilder {

    interface MessageSubject {
        MessageFrom setSubject(String subject);
    }

    interface MessageFrom {
        MessageTo setFrom(String from);
    }

    interface MessageTo {
        MessageCopyTo setTo(String to);
    }

    interface MessageToAll {
        MessageCopyTo setToAll(Set<String> toAll);
    }

    interface MessageCopyTo {
        MessageCopyToAll setCopyTo(String copyTo);
    }

    interface MessageCopyToAll {
        MessageContent setCopyToAll(Set<String> copyToAll);
    }

    interface MessageContent {
        MessageContent setContent(Content content);
        Message build();
    }

    public static class EmailMessageBuilder implements MessageSubject, MessageFrom, MessageTo, MessageCopyToAll, MessageCopyTo, MessageContent {

        String subject;

        String from;

        String to;

        Set<String> toAll;

        String copyTo;

        Set<String> copyToAll;

        Content content;

        public static MessageSubject builder() {
            return new EmailMessageBuilder();
        }


        @Override
        public Message build() {
            if (to == null && toAll == null) {
                throw new RuntimeException("Получатель должен быть заполнен!");
            }
            return new Message(subject, from, to, toAll, copyTo, copyToAll, content);
        }


        @Override
        public MessageFrom setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        @Override
        public MessageTo setFrom(String from) {
            this.from = from == null ? "default@mail.ru" : from;
            return this;
        }

        @Override
        public MessageCopyTo setTo(String to) {
            this.to = to;
            return this;
        }

        @Override
        public MessageCopyToAll setCopyTo(String copyTo) {
            this.copyTo = copyTo;
            return this;
        }

        @Override
        public MessageContent setCopyToAll(Set<String> copyToAll) {
            this.copyToAll = copyToAll;
            return this;
        }

        @Override
        public MessageContent setContent(Content content) {
            this.content = content;
            return this;
        }

    }


}
