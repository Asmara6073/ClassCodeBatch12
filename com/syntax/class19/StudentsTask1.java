package com.syntax.class19;

public class StudentsTask1 {

    String name;
    int math;
    int science;
    int java;



    StudentsTask1(String sName, int mathGrade, int scienceGrade, int javaGrade){
        math=mathGrade;
        name=sName;
       science=scienceGrade;
        java=javaGrade;

    }
     void getAverageGrade(){
         System.out.println(name+" "+(math+science+java)/3);
     }


}
