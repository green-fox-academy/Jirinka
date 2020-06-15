import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int numChicken = scanner.nextInt();

        System.out.println("How many pigs do you have?");
        int numPigs = scanner.nextInt();

        System.out.println("On the farm you have " + ((numChicken * 2) + (numPigs *4)) +  " animals' legs.");
    }
}
