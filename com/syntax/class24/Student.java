package com.syntax.class24;

public class Student {

    String name;
    int age;

    void study(){
        System.out.println("student is studying.");
    }

    void doWork(){
        System.out.println("student is doing work");
    }

   public  void sleep(){
        System.out.println("student is sleeping.");
    }

}
class SyntaxStudent extends Student{

    void study(){
        System.out.println("Syntax students are studying Java");
    }

    void coding(){
        System.out.println("Syntax students are practicing Java");
    }

    void crying(){
        System.out.println("Syntax students are crying");
    }

}class CollegeStudent extends Student{

    void party(){
        System.out.println("student is partying");
    }
     void doWork(){
        System.out.println("Student is in the library doing work");
    }

}class SchoolStudent extends Student{

    void chilling(){
        System.out.println("Student is chilling");
    }

    void reading(){
        System.out.println("student is reading");
    }
    public void sleep(){
        super.sleep();
        System.out.println("Student is sleeping in class");
    }

    public static void main(String[] args) {
        SchoolStudent s=new SchoolStudent();
        s.sleep();



    }
}
