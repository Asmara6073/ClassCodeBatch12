package com.syntax.class34;

public class Tasks {

    public static void checkAge(int age){
        if(age>16){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You are not eligible, must be older than 16");
        }
    }

    public static void checkUsername(String username){
        if (username.length()<5){
            throw new RuntimeException("Username is too short, must be more than 5 characters");
        }else{
            System.out.println("Username has been accepted");
        }
    }

    public static void main(String[] args) {

        try{
            checkAge(14);
        }catch(RuntimeException e){
            checkAge(14+6);
        }

        checkUsername("Hi");

    }

}
