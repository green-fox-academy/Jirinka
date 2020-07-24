package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(2);
        listOfNum.add(2);

        Sum sum = new Sum();
        sum.summary(listOfNum);

        //System.out.println(listOfNum.get(0));

    }
}
