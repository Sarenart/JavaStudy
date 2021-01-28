package com.company;

public class Student extends Person {
    private int Course = 1;
    Student(String Name){
        super(Name);
    }
    Student(String Name, int Course){
        super(Name);
        this.Course = Course;
    }
    void tell(){
        System.out.println(super.getName());
    }
}
