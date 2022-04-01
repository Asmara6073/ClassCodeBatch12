package com.syntax.class29;

import java.util.HashSet;

public class Students {

    /*Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.
     */

    String name;
    String studentID;

    Students(String name,String studentID){
        this.name=name;
        this.studentID=studentID;
    }

    void displayName(){
        System.out.println("Name of student is: "+name);
    }

    public static void main(String[] args) {

        Students Tarik=new Students("Tarik","T1234");
        Students Abby=new Students("Abby","A1234");
        Students Dawit=new Students("Dawit","D1234");
        Students Paulos =new Students("Paulos","P1234");

        HashSet<Students> students=new HashSet<>();
        students.add(Tarik);
        students.add(Abby);
        students.add(Dawit);
        students.add(Paulos);

        for(Students student:students){
            student.displayName();
        }

    }
}
