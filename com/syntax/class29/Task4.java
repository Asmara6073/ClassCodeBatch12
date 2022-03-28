package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.

    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<>();

        for(int i=2;i<=500;i+=2){
            number.add(i);
        }

        Iterator<Integer> itr=number.iterator();

        while(itr.hasNext()){
            if(itr.next()%5==0){
                itr.remove();
            }
        }
        System.out.print(number+" ");

    }
}
