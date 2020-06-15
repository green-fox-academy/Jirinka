import java.util.Scanner;

public class KmtoMiles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles do you want to convert?");

        double milesInput = scanner.nextDouble();

        System.out.println(milesInput + " miles is " + milesInput * 1.6 + " km.");


    }
}
