package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("cheese");
        words.add("hello");
        words.add("slime");
        words.add("basketball");
        words.add("java");
        words.add("cake");

        Iterator<String> itr=words.iterator();

        while(itr.hasNext()){
           if(itr.next().toLowerCase().endsWith("e")){
               itr.remove();
           }
        }
        System.out.println(words);
    }
}
