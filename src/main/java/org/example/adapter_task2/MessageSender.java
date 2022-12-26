package org.example.adapter_task2;

public class MessageSender {
    private static MessageSender messageSender;

    private MessageSender() {}

    public String send(String text, Client user, Country country) {
        if (
                country == Country.Ukraine
        ) {
            return String.format(
                    "Text: \"%s\" was successfully sent to %s",
                    text,
                    user.getEmail()
            );
        }

        throw new IllegalArgumentException(
                "We can't send this message:" +
                        " either this country is not supported" +
                        " or the receiver was not active in last 1 hour"
        );
    }

    public static MessageSender getInstance() {
        if (messageSender == null) {
            messageSender = new MessageSender();
        }
        return messageSender;
    }
}
