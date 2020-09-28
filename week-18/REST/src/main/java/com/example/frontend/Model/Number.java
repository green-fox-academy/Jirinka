package com.example.frontend.Model;

public class Number {

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

    int received;
    int result;

    public Number() {
    }

    public Number(int number) {
        this.received = number;
        this.result = number * 2;

    }
}
