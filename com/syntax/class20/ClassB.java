package com.syntax.class20;

public class ClassB extends ClassA{

    double height;
    boolean isHappy;

    void adding(){
        System.out.println(studentName+" is adding");
    }



    public static void main(String[] args) {

        ClassB cB=new ClassB();
        cB.studentName="Tarik";
        cB.learning();
        cB.sleeping();
        cB.weight=90;
        cB.printF();
    }

}
