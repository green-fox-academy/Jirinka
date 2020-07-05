package com.company;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        Trees cherryTree = new Trees("purple", 1);
        garden.addTree(cherryTree);
        Trees orangeTree = new Trees("orange", 9);
        garden.addTree(orangeTree);

        Flowers rose = new Flowers("blue", 33);
        garden.addFlower(rose);
        Flowers sunflower = new Flowers("yellow", 2);
        garden.addFlower(sunflower);


        garden.printWaterStatus();
        System.out.println(cherryTree.waterAmount);
        System.out.println(rose.waterAmount);
        System.out.println(orangeTree.waterAmount);
        garden.addWater(40);
        garden.printWaterStatus();
        System.out.println(cherryTree.waterAmount);
        System.out.println(rose.waterAmount);
        System.out.println(orangeTree.waterAmount);




        }

    }