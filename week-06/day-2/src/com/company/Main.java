package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int en = 5;
        int sum = addNumber(en);
        System.out.println(sum);
    }

    public static int addNumber(int n){
        if (n == 1){
            return n;
        }
        int sum = n + (addNumber(n-1));
        return sum;

    }
}
