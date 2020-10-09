package com.example.frontend.Model;

public class Number {

    int received;
    int result;
    String error;


    public Number(String error) {
        this.error = "Please provide an input!";
    }

    public Number(int number) {
        this.received = number;
        this.result = number * 2;

    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }



}
