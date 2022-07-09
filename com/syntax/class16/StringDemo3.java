package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {

    public static boolean isPalindrome(String string){

        boolean isPalindrome;
        StringBuilder str=new StringBuilder(string);
        String reversed=str.reverse().toString();

        if(string.equalsIgnoreCase(reversed)){
            isPalindrome= true;
        }else{
            isPalindrome=false;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

        String s="This is a sentence";
        StringBuilder str=new StringBuilder(s);
       String x= str.reverse().toString();
        System.out.println(x);
        String [] strArray=x.split(" ");

        for(int i=(strArray.length)-1;i>=0;i--){
            System.out.print(strArray[i]+" ");
        }


        String y="Hello World";
        String reversed="";

        for(int i=(y.length())-1;i>=0;i--){
            reversed+=y.charAt(i);
        }
        System.out.println(reversed);


        System.out.println(isPalindrome("Tarik"));



    }

}


