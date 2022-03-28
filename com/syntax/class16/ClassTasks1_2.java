package com.syntax.class16;

public class ClassTasks1_2 {

    //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

    public static void main(String[] args) {

        String sentence="I am happy today";
        System.out.println(sentence.replace(" ",""));

        System.out.println("************************************************");
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.


        String combo="1234ABCDefg!@#$";
        System.out.println(combo.length());
        String newCombo=combo.replaceAll("[^A-Z0-9a-z]","");
        System.out.println(newCombo.length());




    }

}
