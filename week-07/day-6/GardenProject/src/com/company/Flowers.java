package com.company;

import java.util.ArrayList;

public class Flowers extends Garden {
    int criticalWaterAmount;

    Flowers (String color, int waterAmount){
        super(color, waterAmount);
        this.criticalWaterAmount=5;
    }

    public void flowerNeedsWater (){
        if(waterAmount<criticalWaterAmount){
            System.out.println(color + " flower needs water.");
        } else {
            System.out.println(color + " flower doesn't need water.");
        }
    }

    public void addWater (int waterAmountAdd){
        waterAmount = (int) (waterAmount+(waterAmountAdd*0.75));

    }
    public boolean needWater (){
        return waterAmount<criticalWaterAmount;
    }

}
