import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me number");
        int number1 = scanner.nextInt();
        System.out.println("Tell me number");
        int number2 = scanner.nextInt();
        System.out.println("Tell me number");
        int number3 = scanner.nextInt();
        System.out.println("Tell me number");
        int number4 = scanner.nextInt();
        System.out.println("Tell me number");
        int number5 = scanner.nextInt();

        System.out.println("Average of your numbers is " + ((number1 + number2 + number3 + number4 + number5)/5));
        System.out.println("Summary or your numbers is " + (number1 + number2 + number3 + number4 + number5));
    }
    }
