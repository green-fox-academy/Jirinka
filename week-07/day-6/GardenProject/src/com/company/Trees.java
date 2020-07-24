package com.company;

public class Trees extends Plants {
    int criticalWaterAmount;

    Trees (String color, int waterAmount){
        super(color, waterAmount);
        this.criticalWaterAmount = 10;
    }

    public void needsWater (){

        if(waterAmount<criticalWaterAmount){
            System.out.println(color + " tree needs water.");
        } else {
            System.out.println(color + " tree doesn't need water.");
        }

    }

    public boolean plantNeedsWater(){
        return waterAmount<criticalWaterAmount;
    }

        public void addWater (int waterAmountAdd){
            waterAmount = (int) (waterAmount+(waterAmountAdd*0.4));
        }
    }

