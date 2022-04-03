package com.syntax.class29;


//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();

    }

class Car extends Insurance{

    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "insuranceName='" + insuranceName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    @Override
    void getQuote() {

        System.out.println(insuranceName+":Here is your quote for your "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" for "+carModel+" has been cancelled");
    }

}
class Pet extends Insurance{
String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "insuranceName='" + insuranceName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }

    @Override
    void getQuote() {

        System.out.println(insuranceName+" : Here is your quote for your "+petType);
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+" for "+petType+" has been cancelled");
    }
}
class Health extends Insurance{


    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void getQuote() {

        System.out.println(insuranceName+" :Here is your quote for your insurance");
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+" has been cancelled");
    }
}

