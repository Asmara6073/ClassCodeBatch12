package com.syntax.class22;

public class Parent {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }

}

class Child1 extends Parent{

    String name="Child";
    void printName(){
        String name="Teyfuring";// First priority is given to local variables
        System.out.println(name);
        /*When we use the "this" keyword even though we have a local variable java will only bring the values from the
        instance variables

         */
        System.out.println(this.name);
        /*When we use the "super" keyword even though we have a local variable and instance variable inside the same
        class, java will only bring the values from parent class instance variables.
         */
        System.out.println(super.name);
    }

}

class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();

    }


}
