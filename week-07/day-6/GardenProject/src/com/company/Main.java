package com.company;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        Trees cherryTree = new Trees("purple", 0);
        garden.addPlant(cherryTree);
        Trees orangeTree = new Trees("orange", 0);
        garden.addPlant(orangeTree);
        Flowers rose = new Flowers("blue", 0);
        garden.addPlant(rose);
        Flowers sunflower = new Flowers("yellow", 0);
        garden.addPlant(sunflower);

        garden.waterStatus();
        garden.addWater(40);
        garden.waterStatus();
        System.out.println(cherryTree.waterAmount);
        garden.addWater(70);
        garden.waterStatus();
        System.out.println(cherryTree.waterAmount);
    }
}