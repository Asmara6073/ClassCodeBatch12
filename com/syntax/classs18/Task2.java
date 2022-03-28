package com.syntax.classs18;

public class Task2 {

    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public static void reverseString(String x){ // VOID METHOD
        StringBuilder str=new StringBuilder(x);
        System.out.println(str.reverse().toString());

    }

    public static String reverseStrings(String y){  // RETURN METHOD
        StringBuilder stringBuilder=new StringBuilder(y);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Task2 obj1=new Task2();
        Task2.reverseString("Sunday");

        System.out.println(Task2.reverseStrings("Tarik"));
    }

}
