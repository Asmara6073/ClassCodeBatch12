package com.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);


        System.out.println( fruitMap.keySet());
        System.out.println(fruitMap.values());

        System.out.println(fruitMap.entrySet());

        //getting keys and values in the form of an entry (Map.Entry)
        Iterator<Map.Entry<String,Double>> itr= fruitMap.entrySet().iterator();

        while(itr.hasNext()){
            //System.out.println(itr.next());
            //System.out.println(itr.next().getKey());
            System.out.println(itr.next().getValue());
        }
    }
}
