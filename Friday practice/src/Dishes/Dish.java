package Dishes;

import java.util.ArrayList;

public class Dish {

    private String name;
    private Ingredient ingredient1;
    private Ingredient ingredient2;

    public ArrayList<Ingredient> getIngredients (){
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        return  ingredients;
    }

}
