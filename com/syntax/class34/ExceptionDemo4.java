package com.syntax.class34;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        System.out.println("0");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("2");
        }catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
            //arithmeticException.printStackTrace();
        }
        System.out.println("4");
    }

}
