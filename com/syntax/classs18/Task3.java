package com.syntax.classs18;

public class Task3 {

    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the class only where it was declared and executed by calling it is name.
    //Static methods can access other static methods and fields without needing an object of that class or the class
    //name if they are in the same class


    private static void onlyVowels(String x){ // VOID METHOD
        System.out.println(x.replaceAll("[^a,i,o,u,e,A,I,O,U,E]",""));
    }

    private static String vowels(String y){ // RETURN METHOD
       return y.replaceAll("[^a,i,o,u,e,A,I,O,U,E]","");
    }

    public static void main(String[] args) {
        Task3 obj1=new Task3();
        obj1.onlyVowels("Tarik");


        Task3 obj2= new Task3();
        System.out.println(obj2.vowels("Encyclopedia"));

        onlyVowels("Abeselom Abraham");

    }
}
