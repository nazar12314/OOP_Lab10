package org.example.adapter_task3;

public class DataBase extends БазаДаних {

    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getStaticData() {
        return super.отриматиСтатистичніДані();
    }
}
