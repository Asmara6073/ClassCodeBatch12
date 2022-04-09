package com.syntax.class31;

import java.util.LinkedHashSet;

public class ConcatanateAllStringsFromCollection {

    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
     *Write a logic to concatenate all string from the collection.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> words=new LinkedHashSet<>();

        words.add("Hello");
        words.add(",");
        words.add(" my");
        words.add(" name");
        words.add(" is");
        words.add(" Tarik.");

        StringBuilder concat= new StringBuilder();
        for( String strings:words){
            concat.append(strings);

        }
        System.out.println(concat);



    }
}
