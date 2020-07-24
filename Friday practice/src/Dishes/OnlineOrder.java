package Dishes;

public class OnlineOrder extends Order {

    private String address;

    public OnlineOrder(String address, Dish[] dishes) {
        super(dishes);
        this.address = address;
    }
}
