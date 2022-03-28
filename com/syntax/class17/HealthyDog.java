package com.syntax.class17;

public class HealthyDog {

    String name;// instance variable
    String color;// instance variable
    static int numberOfLegs;// static variable

    void eat(){
        int noOfTimes=3;// local variable
        System.out.println(name+" eats "+noOfTimes);
    }

    public static void main(String[] args) {

        HealthyDog dog=new HealthyDog();// local variable

        dog.name="Scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Tommy";
        dog2.color="Red";
        HealthyDog.numberOfLegs=4;
        dog2.eat();

        MethodsPractice obj2=new MethodsPractice();
        System.out.println(obj2.makeBabyName("Tarik","Bethann","Boy",null));



    }

}
