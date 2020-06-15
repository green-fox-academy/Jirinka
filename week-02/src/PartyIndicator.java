import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many boys are coming to the party?");
        int numberOfBoys = scanner.nextInt();

        System.out.println("How many girls are coming to the party?");
        int numberOfGirls = scanner.nextInt();

        if (numberOfBoys == numberOfGirls && ((numberOfBoys+numberOfGirls) >= 20)) {
            System.out.println("The party is excellent");
        } else if (((numberOfBoys+numberOfGirls)>=20 && numberOfBoys != numberOfGirls) && numberOfGirls!=0) {
            System.out.println("Quite cool party");
        } else if ((numberOfBoys+numberOfGirls) < 20) {
            System.out.println("Average party");
        } else if (numberOfGirls == 0) {
            System.out.println("Sausage party!");
        }
    }
}
