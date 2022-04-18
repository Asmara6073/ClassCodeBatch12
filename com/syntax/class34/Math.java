package com.syntax.class34;

public class Math {
    void add(int a, int b){
        System.out.println(a+b);
    }

    void divide(int a,int b){
    /*   if(b!=0){
           System.out.println(a/b);
       }else{
           System.out.println("You can't divide by zero, make better life decisions");
       }*/

        try{
            System.out.println(a/b);
        }catch(ArithmeticException are){
            System.out.println("You can't divide by zero, make better life decisions");
        }catch(NullPointerException npe){
            System.out.println("please initialize the object");
        }


    }
}
