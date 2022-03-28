package com.syntax.class29;


//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {
    String insuranceName;

    abstract void getQuote();
    abstract void cancelInsurance(String insuranceName);

    }

class Car extends Insurance{

    String carModel;
    Car(String carModel,String insuranceName){
        super.insuranceName=insuranceName;
        this.carModel=carModel;
    }
    @Override
    void getQuote() {

        System.out.println(insuranceName+":Here is your quote for your "+carModel);
    }

    @Override
    void cancelInsurance(String insuranceName) {
        System.out.println(insuranceName+" has been cancelled");
    }

}
class Pet extends Insurance{
String petType;

Pet(String petType,String insuranceName){
    this.insuranceName=insuranceName;
    this.petType=petType;
}

    @Override
    void getQuote() {

        System.out.println(insuranceName+" : Here is your quote for your "+petType);
    }

    @Override
    void cancelInsurance(String insuranceName) {

        System.out.println(insuranceName+" has been cancelled");
    }
}
class Health extends Insurance{
    String healthInsType;

    Health(String healthInsType,String insuranceName){
        this.insuranceName=insuranceName;
        this.healthInsType=healthInsType;
    }

    @Override
    void getQuote() {

        System.out.println(insuranceName+" :Here is your quote for your "+healthInsType);
    }

    @Override
    void cancelInsurance(String insuranceName) {

        System.out.println(insuranceName+" has been cancelled");
    }
}

