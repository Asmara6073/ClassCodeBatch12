package com.syntax.class20;

public class Frog {

        String name;
        String color;
        int age;
        double weight;

    public Frog(String name, String color, int age, double weight) {
       this(name,color,age);
       // this() should be the first line inside the constructor
        // Constructor body
        this.weight = weight;
    }
    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;




}
    void printInfo(){
        //this() not allowed in a method
        System.out.println(name+" "+color+" "+age+" "+weight);
    }

}
