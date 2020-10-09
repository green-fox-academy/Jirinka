package com.example.frontend.Model;

public class Greeting {

    String welcome_message;

    public Greeting(String welcomeMessage) {
        this.welcome_message = welcomeMessage;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

}
