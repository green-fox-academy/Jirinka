package com.company;

import java.util.ArrayList;

public class Sum {
    //ArrayList<Integer> list = new ArrayList<Integer>();

    public Sum (){}

    public void summary (ArrayList<Integer> list){

        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum);

    }

}
