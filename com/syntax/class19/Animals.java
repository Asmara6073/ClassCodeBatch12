package com.syntax.class19;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animals {

    String color;
    double weight;
    int age;
    String type;
    char gender;



    Animals(){

    }
    Animals(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public Animals(int age){
        this.age=age;
    }

    private Animals(String type){
        this.type=type;
    }

    protected Animals(char gender){
        this.gender=gender;
    }

     void  getAnimalType(){
         System.out.println(this.type);
    }

    public static void main(String[] args) {

        Animals animal=new Animals("Red",76.89);
       Animals animal2=new Animals(45);
       Animals animal3=new Animals("Lion");
       Animals animal4=new Animals('F');
    }

}
