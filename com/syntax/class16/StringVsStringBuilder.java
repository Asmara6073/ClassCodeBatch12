package com.syntax.class16;



public class StringVsStringBuilder {

    public static void main(String[] args) {

        String s="Asghar Is Great";// original string
        s.concat("hahahah");// add new string to original string
        System.out.println(s);// printing out original string


        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");// original string
        stringBuilder.append("hahahaha");// add new string to original string builder
        System.out.println(stringBuilder);

    }


}
