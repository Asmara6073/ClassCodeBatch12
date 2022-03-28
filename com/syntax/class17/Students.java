package com.syntax.class17;

import javax.imageio.stream.ImageInputStream;

public class Students {

    String studentName;
    String studentID;
    static int numberOfStudents=0;

    public static void main(String[] args) {

        Students st1=new Students();
        st1.studentName="Tarik";
        st1.studentID="ST123";
        Students.numberOfStudents++;

        System.out.println(numberOfStudents);


        Students st2=new Students();
        st2.studentName="Bethann";
        st2.studentID="ST1234";
        Students.numberOfStudents++;

        System.out.println(numberOfStudents);


    }





}
