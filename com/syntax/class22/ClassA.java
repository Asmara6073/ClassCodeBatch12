package com.syntax.class22;

public class ClassA {

    void method(){
        System.out.println("method from ClassA");
    }

}
class ClassB extends ClassA{

    void method(){
        System.out.println("method from ClassB");
    }

    void test(){
        method();
        this.method();
        super.method();
    }
}

class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}