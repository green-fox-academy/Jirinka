package Dishes;

public class OfflineOrder extends Order {

    private int table;

    public OfflineOrder(int table, Dish[] dishes){
        super(dishes);
        this.table = table;
    }
}
