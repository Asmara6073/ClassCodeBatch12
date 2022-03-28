package com.syntax.class23;

public class MethodOverloadingDemo1 {


    static int add(int...numArray){
        int sum=0;
        for(int num:numArray){
            sum+=num;
        }return sum;
    }

    public static void main(String[] args) {

                String str_Sample = "";
                System.out.println( str_Sample.isEmpty());
    }

}
