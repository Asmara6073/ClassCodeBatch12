package com.syntax.class31;

import java.util.HashMap;

public class MapDemo1 {

    public static void main(String[] args) {
        HashMap <String,Double> fruitMap=new HashMap<>();

        //fruitMap.put("Apple", 20);-> implicit casting does not work in collections and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Banana",12.5);// duplicate keys are overwritten
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi"));
        System.out.println(fruitMap.get("kiwi"));// case sensitive

        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsValue(12.5));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        System.out.println(fruitMap.replace("Banana",50.0));
        System.out.println(fruitMap);




    }

}
