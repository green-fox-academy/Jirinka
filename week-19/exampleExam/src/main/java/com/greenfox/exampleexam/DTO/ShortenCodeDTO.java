package com.greenfox.exampleexam.DTO;

import com.greenfox.exampleexam.Model.Shortens;

public class ShortenCodeDTO {
    private String secretCode;

    public ShortenCodeDTO(Shortens shortens){
        this.secretCode = shortens.getSecretCode();
    }
    public ShortenCodeDTO(){}

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }
}
