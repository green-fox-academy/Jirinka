package com.company;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class Trees extends Garden {
    int criticalWaterAmount;

    Trees (String color, int waterAmount){
        super(color, waterAmount);
        this.criticalWaterAmount = 10;
    }

    public void treeNeedsWater (){

        if(waterAmount<criticalWaterAmount){
            System.out.println(super.color + " tree needs water.");
        } else {
            System.out.println(super.color + " tree doesn't need water.");
        }

    }

    public boolean needWater(){
        return waterAmount<criticalWaterAmount;
    }
    public void print(){

            System.out.println(super.color);

        }

        public void addWater (int waterAmountAdd){

            waterAmount = (int) (waterAmount+(waterAmountAdd*0.4));


        }
    }

