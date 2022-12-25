package org.example.singleton_task1;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class User {

    private int id;

    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void save() {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.executeQuery(
                String.format(
                        "insert into user (email, name, age) values ('%s', '%s', %d);",
                        email,
                        name,
                        age
                )
        );
    }
}
