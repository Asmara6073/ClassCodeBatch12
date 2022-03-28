package com.syntax.class25;

public interface Employee {
    int age=30;
     void work();
    /*
    All the methods inside an interface which do not have body are abstract public
    By default all variables in an interface are public static final
     */

}

class Tester implements Employee{


    @Override
     public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester =new Tester();
        tester.work();
        System.out.println(Employee.age);
    }
}
