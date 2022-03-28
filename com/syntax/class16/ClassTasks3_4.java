package com.syntax.class16;

import java.util.Arrays;

public class ClassTasks3_4 {

    // Task 4 method

      String reverseString(String inputString){
        //converting String to Stringbuilder
       StringBuilder stringBuilder=new StringBuilder(inputString);
       stringBuilder.reverse();
        return stringBuilder.toString();

       }






    //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    // How would you find out how many sentences are in that String?

    public static void main(String[] args) {


        String a="Is it saturday? Is it raining? Do we have a Java Class today?";

        String [] strArray= a.split("[?]");
        System.out.println(Arrays.toString(strArray));

        // How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever

       StringBuilder stringBuilder=new StringBuilder("This is sentence I want to reverse");

        System.out.println(stringBuilder.reverse());

        String str=stringBuilder.toString();
        System.out.println(str);
        String [] str2Arr=str.split(" ");
        System.out.println(Arrays.toString(str2Arr));

        for(int i= str2Arr.length-1;i>=0;i--){
            System.out.print(str2Arr[i]+" ");
        }







    }



}
