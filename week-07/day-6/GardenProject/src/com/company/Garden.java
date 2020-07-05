package com.company;

import java.util.ArrayList;

public class Garden {

    String color;
    int waterAmount;
    ArrayList<Trees> trees;
    ArrayList<Flowers> flowers;

    public Garden(String color, int waterAmount) {
        this.color = color;
        this.waterAmount = waterAmount;
        this.flowers= new ArrayList<>();
        this.trees = new ArrayList<>();
    }
    public Garden(){
        this("bad",100);
    }

    public void addTree(Trees tree){
        this.trees.add(tree);
    }
    public void addFlower(Flowers flower){
        this.flowers.add(flower);
    }


    public void addWater(int waterAmountAdd){
        System.out.println("watering with " + waterAmountAdd);
        for (Trees strom: trees){
            if (strom.needWater())
            strom.addWater(waterAmountAdd);
        }
        for (Flowers kytka: flowers) {
            if (kytka.needWater()) {
                kytka.addWater(waterAmountAdd);
            }
        }
    }

    public void printWaterStatus(){
        
        for (Trees strom: trees){
            strom.treeNeedsWater();
        }
        for (Flowers kytka: flowers) {
            kytka.flowerNeedsWater();

        }
        }



   }



