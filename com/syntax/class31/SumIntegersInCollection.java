package com.syntax.class31;

import java.util.LinkedList;

public class SumIntegersInCollection {

    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        int sum = 0;
        for(Integer num:numbers){
            sum+=num;

        }
        System.out.println(sum);
    }

}
