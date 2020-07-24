package DataStructures;

import java.util.*;

public class ProductDatabase {
    public static void main(String[] args) {

        HashMap<String, Integer> database = new HashMap<>();
        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);
        //How much is the fish?
        int fishPrice = database.get("Fish");
        System.out.println(fishPrice);
        //What is the most expensive product?

        int mostExpensive = 0;
        String mostExpensiveName = "";

        for (Map.Entry<String, Integer> food : database.entrySet()) {
            if (food.getValue() > mostExpensive) {
                mostExpensive = food.getValue();
                mostExpensiveName = food.getKey();
            }
        }
















        for (int price: database.values()) {
            if (mostExpensive<price){
                mostExpensive=price;
            }
        }
        System.out.println(mostExpensive);

        String fuckingKey="";
        for (Map.Entry<String, Integer> food : database.entrySet()) {


            if (food.getValue().equals(mostExpensive)) {
                fuckingKey = food.getKey();
            }
        }
        System.out.println(fuckingKey);
    }

}
