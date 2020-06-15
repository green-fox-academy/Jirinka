package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me number");
        int inputNumber = scanner.nextInt();

        if (inputNumber%10 == 0) {
            System.out.println(inputNumber + " is even.");
        } else if (inputNumber%10 == 2) {
            System.out.println(inputNumber + " is even");
        } else if (inputNumber%10 == 4) {
            System.out.println(inputNumber + " is even");
        } else if (inputNumber%10 == 6) {
            System.out.println(inputNumber + " is even");
        } else if (inputNumber%10 == 8) {
            System.out.println(inputNumber + " is even");
        } else {
            System.out.println("Your number " + inputNumber + " is odd");
        }


    }
}
