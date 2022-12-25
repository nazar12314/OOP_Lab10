package org.example;

import org.example.adapter_task2.Country;
import org.example.adapter_task2.Login;
import org.example.adapter_task2.LoginMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println(Login.login(LoginMethod.TWITTER, "nazar@gmail.com", Country.Ukraine, "20-11-2020"));
    }
}