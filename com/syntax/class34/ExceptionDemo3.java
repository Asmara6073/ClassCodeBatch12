package com.syntax.class34;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("0");
        try{
            System.out.println(10/0);
            System.out.println("1");
           // throw new RuntimeException();

        }catch(ArithmeticException arithmeticException){
            System.out.println("2");
        }catch(Exception e){
            System.out.println("Oops, something went wrong");
        }finally {
            System.out.println("6");
        }

        System.out.println("7");
    }

    }


