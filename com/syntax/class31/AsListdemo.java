package com.syntax.class31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListdemo {
    public static void main(String[] args) {

        int[] arr={10,20,30};
        int [] arr2=new int[5];

        arr2[0]=10;

        List<Integer> list= Arrays.asList(10,20,30);
       // System.out.println(list);

        List<Integer>list2=new ArrayList<>(list);
        System.out.println(list2);
        list2.add(40);
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);




    }
}
