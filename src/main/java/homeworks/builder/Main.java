package homeworks.builder;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> copyToAll = new HashSet<>();
        copyToAll.add("Смирнов");
        copyToAll.add("Соболев");

        Message message = MessageBuilder.EmailMessageBuilder.builder()
               .setSubject("Поручение.")
                .setFrom("Директор")
                .setTo("Иванов")
                .setCopyTo("Петров")
                .setCopyToAll(copyToAll)
                .setContent(new Content("Всем быть на работе к 7!", "С уважением, директор."))
                .build();
        System.out.println(message);

    }
}
