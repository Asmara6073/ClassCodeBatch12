package com.syntax.class29;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {

    /*How can you remove all duplicates from ArrayList?
    List<String> aList=new ArrayList<>();
    aList.add("John");
    aList.add("Jane");
    aList.add("James");
    aList.add("Jasmine");
    aList.add("Jane");
    aList.add("James");
     */


    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        TreeSet<String> aListWithoutDuplicates=new TreeSet<>(aList);
        System.out.println(aListWithoutDuplicates);



    }
}
