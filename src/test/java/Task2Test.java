import org.example.adapter_task2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class Task2Test {

    @Test
    public void testMessageSender() {
        MessageSender messageSender = MessageSender.getInstance();

        Client facebookClient = Login.login(
                LoginMethod.FACEBOOK,
                "nazar@gmail.com",
                Country.Ukraine,
                String.valueOf(LocalDate.now())
        );

        Assertions.assertDoesNotThrow(
                () -> messageSender.send("Hello world", facebookClient, Country.Ukraine),
                "We can't send this message:" +
                        " either this country is not supported" +
                        " or the receiver was not active in last 1 hour"
                );

    }

    @Test
    public void testMessageSenderFailed() {
        MessageSender messageSender = MessageSender.getInstance();
        Client facebookClient = new FacebookClient(
                new FacebookUser(
                        "nazar@gmail.com",
                        Country.Ukraine,
                        LocalDate.of(2020, Month.AUGUST, 12)
                )
        );

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> messageSender.send("Hello world", facebookClient, Country.Poland)
        );
    }
}
