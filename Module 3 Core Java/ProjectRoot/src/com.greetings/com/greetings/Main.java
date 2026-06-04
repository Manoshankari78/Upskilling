package com.greetings;
import com.utils.StringFormatter;
public class Main {
    public static void main(String[] args) {
        String welcomeMessage = "Hello from the modular world!";
        String formattedOutput = StringFormatter.toBanner(welcomeMessage);
        System.out.println(formattedOutput);
    }
}