package com.syntax.class19;

import com.syntax.class17.Students;

public class StudentHw {

    String name;
    String address;

    StudentHw(String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("The name of the student is: "+this.name+" and the address is "+this.address);

    }


    public static void main(String[] args) {


       StudentHw s1= new StudentHw("Tarik","4201 Massachusetts Avenue NW Washington,DC");

       s1.displayInfo();

    }
}
