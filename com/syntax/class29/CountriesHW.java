package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

public class CountriesHW {
    /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.

     */

    public static void main(String[] args) {

        TreeSet<String>countries=new TreeSet<>();
        countries.add("Eritrea");
        countries.add("Canada");
        countries.add("Turkey");
        countries.add("Albania");
        countries.add("Kurdistan");
        countries.add("USA");
        countries.add("Tanzania");
        countries.add("Greece");

        Iterator<String> itr= countries.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String country:countries){
            System.out.println(country);
        }



    }
}

