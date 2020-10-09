package com.example.frontend.Model;

public class Error {
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private String error;

    public Error(String error){
        this.error = error;

    }

}
