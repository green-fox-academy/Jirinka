package com.company;

public class Flowers extends Plants {
    int criticalWaterAmount;

    Flowers (String color, int waterAmount){
        super(color, waterAmount);
        this.criticalWaterAmount=5;
    }

    public void needsWater (){
        if(waterAmount<criticalWaterAmount){
            System.out.println(color + " flower needs water.");
        } else {
            System.out.println(color + " flower doesn't need water.");
        }
    }
    public boolean plantNeedsWater(){
        return waterAmount<criticalWaterAmount;
    }

    public void addWater (int waterAmountAdd){
        waterAmount = (int) (waterAmount+(waterAmountAdd*0.75));

    }


}
