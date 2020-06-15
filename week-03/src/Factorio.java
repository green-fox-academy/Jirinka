import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberForFactorio = scanner.nextInt();
        System.out.println(factorio(numberForFactorio));


    }
    public static int factorio (int inputNumber) {
        int number=1;
        for (int i = 1; i <= inputNumber; i++) {
            number = number * i;

            /*for (int j = 1; j <= inputNumber ; j++) {
                number = number + 1;
            }*/

        } return number;

    }
}
