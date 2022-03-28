package com.syntax.class19;

public class Human {

    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age,double weight) {
        this.name = name;
        this.age=age;
        this.weight=weight;
        System.out.println("Important Code");
    }
    public Human(String name, int age,double weight,char gender){
        this(name,age,weight);
        this.gender=gender;

    }
}
