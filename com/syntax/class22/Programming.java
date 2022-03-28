package com.syntax.class22;

public class Programming {


    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String x){
        System.out.println("I love "+x);
    }


    public static void main(String[] args) {
        Programming obj=new Programming();
        Programming obj2=new Programming("Java");

    }

}
