package com.company;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    public float use(){
        inkAmount -=2.2;
        return inkAmount;
    }
    public void print() {
        System.out.println("After painting " + color + " sharpie with width " + width + " remains " + inkAmount + " of color.");
    }
}
