package com.syntax.class19;

public class Horse {

    // It is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;
    // A constructor without any parameter it is called no argument/zero argument
    // purpose of constructor is to give initial values to fields of a class
    //Horse(){
        // write some important lines of code that you want to execute when the object of a class is created
        // for example: you might want to fetch some info from internet or from your hard disk to give initial values
        //to the field
    //}

   Horse(String horseName, int horseAge,double horseWeight){
    name=horseName;
    age=horseAge;
    weight=horseWeight;
   }

   // Rule no.1- Constructors dont have return types like int,String not even void
   // Rule no.2- Name of the Constructor should be same as name of the class
   void printHorseName(){
       System.out.println("Name "+name);
   }

   void setName(String horseName){
       name=horseName;
   }


}
