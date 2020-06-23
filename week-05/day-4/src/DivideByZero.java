import javax.swing.plaf.multi.MultiSeparatorUI;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

    public static void divide (){
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int result = 10/userInput;
        System.out.println(result);

    }

}
