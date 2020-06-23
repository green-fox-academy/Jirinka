package com.company;

import org.w3c.dom.ls.LSOutput;

public class PostIt {
    public String backgroundColor;
    public String text;
    public String textColor;

    PostIt (String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
        public void print() {
            System.out.println(this.text + " is written in " + this.textColor + " on " + this.backgroundColor + " background.");
         }

}
