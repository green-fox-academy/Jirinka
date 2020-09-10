package project.foxclub.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

    private String name;
    private ArrayList<Trick> tricks;

    public Fox(String name) {
        this(name, new ArrayList<Trick>(), Food.icecream, Drinks.wine);
    }

    public Fox(String name, ArrayList<Trick> tricks, Food food, Drinks drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    private Food food;
    private Drinks drink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }

    public void addTrick(Trick trick){
        if (!isLearned(trick)){
            tricks.add(trick);
        }
    }
    public boolean isLearned(Trick trick){
       return tricks.contains(trick);
    }

    public List<Trick> getNotLearnedTricks(){
       return Arrays.stream(Trick.values()).collect(Collectors.toList());//filter(trick -> !tricks.contains(trick)).collect(Collectors.toList());

    }
}
