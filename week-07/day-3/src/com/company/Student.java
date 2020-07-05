package com.company;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + super.name + ", a " + super.age + " year old " + gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;

    }
    public Student (String name, int age, String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
    }
    public Student(){
        super("Jane Doe", 30, "female");
        previousOrganization = "School of life";
        skippedDays = 0;
    }
}
