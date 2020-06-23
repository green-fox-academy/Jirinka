package com.company;

public class Animal {
    int hunger = 50;
    int thirst = 50;

    Animal (){

    }

    public int eat (){
        this.hunger -=1;
        return hunger;
    }
    public  void drink(){
        this.thirst -=1;
    }
    public void play(){
        this.hunger -=1;
        this.thirst -=1;
    }
    public void printIt(){
        System.out.println("Animal's hunger: " + hunger + ". Animal thirst: " + thirst + ".");
    }


}
