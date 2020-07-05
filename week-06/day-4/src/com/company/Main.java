package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int en = 55555;

        System.out.println(sumDigit(en));

        int baseNumber = 3;
        int powerNumber = 4;

        System.out.println(power(baseNumber, powerNumber));

        int numOfBunnies = 5;
        System.out.println(bunnies(numOfBunnies));
    }

        public static int sumDigit(int n){
            if (n==0){
                return n;
            }
            int sum = (n % 10) + (sumDigit(n / 10));
            return sum;
        }

        public static int power (int baseNumber, int powerNumber){
            if ( powerNumber == 1){
                return baseNumber;
            }
            int sum = baseNumber * power(baseNumber,powerNumber-1);
            return sum;
        }

        public static int bunnies (int numOfBunnies){
            if (numOfBunnies == 0){
            return 0;
            }
            return 2 + bunnies(numOfBunnies-1);
        }

        public static int weirdBunnies(int numOfBunnies){
            if (numOfBunnies ==0){
                if ()
                return 0;
            }
            int numBunnies2ears =
        }
}