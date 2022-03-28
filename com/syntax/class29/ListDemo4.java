package com.syntax.class29;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {

        Student Teyfur=new Student("Teyfur",20,"Memes");
        Student Gulden=new Student("Flower Pot",21,"Study");
        Student Emilia=new Student("Emilia",21,"Coding");



        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(Teyfur);
        studentLinkedList.add(Gulden);
        studentLinkedList.add(Emilia);
        System.out.println(studentLinkedList);


    }


}
class Student{

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    String name;
    int age;
    String hobbies;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
