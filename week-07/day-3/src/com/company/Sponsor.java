package com.company;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor(){
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;

    }

    Sponsor(String name, int age, String gender, String company){
        super(name,age,gender);
        this.company = company;
    }


    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + " who represents company " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire (){
        hiredStudents = hiredStudents+1;
    }
    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
}
