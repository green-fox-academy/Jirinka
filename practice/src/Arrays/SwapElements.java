package Arrays;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third", "forth"};
        for (int i = 0; i < orders.length/2; i++) {
            String temp = orders[i];
            orders[i]= orders[orders.length-1-i];
            orders[orders.length-1-i]=temp;
        }
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }


    }
}
