package com.syntax.class20;

public class MathTeacher extends Teachers {

    void adding(){
        System.out.println(name+" is adding");
    }
    void subtracting(){
        System.out.println(name+" is subtracting");
    }

    public static void main(String[] args) {
        MathTeacher m=new MathTeacher();
        m.name="Tarik";
        m.scolding();
        m.demo();
        m.adding();

    }
}
