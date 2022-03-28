package com.syntax.class19;

public class SeriousHorseTester {


    public static void main(String[] args) {


        /*
        Horse-> Data Type(Names of classes)
        horse-> Object, instance, reference variable/variable
        = -> assignment operator
        Horse("Jacky",55,125.7) -> call to a constructor
        ; line terminator

         */
        Horse horse=new Horse("Jacky",55,125.7);
        horse.printHorseName();
    }
}
