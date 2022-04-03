package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();

        fruit.put("Orange",10);
        fruit.put("Apple",10000);
        fruit.put("Banana",15);

        Map<String,Integer> veggies=new HashMap<>();
        veggies.put("potato",12);
        veggies.put("tomato",10);

        Map<String,Integer> groceries=new HashMap<>();

        groceries.putAll(fruit);
        groceries.putAll(veggies);

        System.out.println(groceries);
    }

}
