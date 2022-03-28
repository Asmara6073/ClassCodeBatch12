package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {

    public static void main(String[] args) {

        String s="This is a sentence";
        String [] strArray=s.split(" ");
        System.out.println(Arrays.toString(strArray));
        System.out.println(strArray[2]);



    }

}


