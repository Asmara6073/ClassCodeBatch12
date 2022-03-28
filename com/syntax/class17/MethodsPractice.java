package com.syntax.class17;

import java.util.Arrays;

public class MethodsPractice {



// Write a method to compute the future investment value at a given interest rate for a specified number of years

    public double futureInvestment(double initialInv, double rate, int years){
        double compound=Math.pow(rate+1,years);
        double future=initialInv*compound;
        return future;
    }

    public String makeBabyName(String dad, String mom, String gender,String babyName){

        if(gender.equalsIgnoreCase("Boy")){
            babyName=dad.substring(0,dad.length()/2).concat(mom.substring(mom.length()/2));
        }else {
            babyName=mom.substring(0,mom.length()/2).concat(dad.substring(dad.length()/2));
        }
        return babyName;
    }

    public char middleChar(String input) {
        char output = 0;
        if (input.length() > 0) {
            if (input.length() % 2 != 0 && input.length() > 3) {
                output= input.charAt(input.length() / 2);
            }
        }return output;
    }

        public void reverseString(String x){
        StringBuilder build=new StringBuilder(x);
        build.reverse();
        String str=build.toString();
        String strarray []=str.split(" ");
            Arrays.toString(strarray);
        for(int i=strarray.length-1;i>=0;i--){
            System.out.print(strarray[i]+" ");
        }


        }

        public String withoutSpaces(String x){
        String str=x.replaceAll(" ","");
        return str;
        }

        public boolean isPalindrome(String x){
        StringBuilder build=new StringBuilder(x);
        String revStr=build.reverse().toString();
        return revStr.equals(x);
        }








    public static void main(String[] args) {

        MethodsPractice obj1=new MethodsPractice();
        System.out.println(obj1.futureInvestment(2000,.10,50));
        System.out.println(obj1.middleChar("Tarik"));
        obj1.reverseString("Paulos is the man with the plan!");
        System.out.println();
        System.out.println(obj1.withoutSpaces("Hello I am Tarik"));
        System.out.println(obj1.isPalindrome("Tarik"));



    }
}
