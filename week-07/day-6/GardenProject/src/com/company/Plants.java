package com.company;

import java.util.ArrayList;

public abstract class Plants {
    String color;
    int waterAmount;

    Plants (String color, int waterAmount){
        this.color=color;
        this.waterAmount=waterAmount;

    }

    public abstract void addWater(int waterAmountAdd);
    public abstract boolean plantNeedsWater();
    public abstract void needsWater();

}



