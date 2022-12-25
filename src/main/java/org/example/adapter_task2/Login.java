package org.example.adapter_task2;

import java.time.LocalDate;

public class Login {

    public static Client login(LoginMethod loginMethod, String userMail, Country country, String date) {
        if (loginMethod == LoginMethod.TWITTER) {
            return new TwitterClient(new TwitterUser(
                    userMail,
                    country.toString(),
                    date
            ));
        } else if (loginMethod == LoginMethod.FACEBOOK) {
            return new FacebookClient(new FacebookUser(
                    userMail,
                    country,
                    LocalDate.parse(date)
            ));
        }

        throw new IllegalArgumentException("No such login method");
    }

}
