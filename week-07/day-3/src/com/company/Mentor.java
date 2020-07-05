package com.company;

import java.util.ArrayList;

public class Mentor extends Person {
    String level;

    Mentor (){
        super ("Jane Doe", 30, "female");
        this.level = "intermediate";
        }

     Mentor (String name, int age, String gender, String level){
        super(name, age, gender);
        this.level=level;
     }

    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce (){
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
    }

}
