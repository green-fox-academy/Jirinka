package Dishes;

import java.util.Random;

public class Order {

    private int id;
    private String status;
    private Dish[] dishes;

    public Order(Dish[] dishes) {
        Random random = new Random();
        this.dishes = dishes;
        this.status = "created";
        this.id = random.nextInt(10000-1001)+1001;
    }

    public void delay() {
        this.status = "waiting";
    }

    public void deliver() {
        this.status = "delivered";
    }

    public void reject() {
        this.status = "rejected";
    }

    public Dish[] getDishes() {
        return this.dishes;
    }

}
