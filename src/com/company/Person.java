package com.company;

public class Person {
    public Person(String Name){
        this.Name = Name;
    }
    public Person(){

    }
    public String getName(){
        return Name;
    }
    public int height = 180;
    private String Name;
    public void Say(){
        System.out.println("Hi, my name is " + Name);
    }
}



