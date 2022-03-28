package com.syntax.class25;

public class Parent {
    final String name="Tarik";
    //name="Abby"; can't reassign if variable is final
    final void method(){
        System.out.println("i am parent");
    }

    void method2(){

    }

}
class Child extends Parent{
   /* void method(){
        can't override because it is final method
    }*/
}