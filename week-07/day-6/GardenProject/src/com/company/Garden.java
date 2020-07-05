package com.company;

import java.util.ArrayList;

public class Garden {
    ArrayList<Plants> plants = new ArrayList<>();
    int plantsNeedWater = 0;

    public Garden() {
    }

    public void addPlant (Plants plants){
        this.plants.add(plants);
    }

    public void addWater(int waterAmountAdd){
        System.out.println("watering with " + waterAmountAdd);
        for (Plants plant: plants) {
            if (plant.plantNeedsWater())
                plantsNeedWater++;
        }
        waterAmountAdd = (waterAmountAdd/plantsNeedWater);
        for (Plants plant: plants){
            if (plant.plantNeedsWater())
            plant.addWater((waterAmountAdd));
        }
    }
    public void waterStatus(){
        for (Plants plant: plants) {
            plant.needsWater();
        }
    }

   }



