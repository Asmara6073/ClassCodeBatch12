package com.syntax.class29;

import java.util.ArrayList;
import java.util.Locale;

public class Task3 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Ginger Ale");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Gatorade");
        drinks.add("milk");


        for(int i=0;i< drinks.size();i++){
            if(drinks.get(i).toLowerCase().contains("a")||drinks.get(i).toLowerCase().contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);


        }


    }


