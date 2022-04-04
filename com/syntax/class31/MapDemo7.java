package com.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {

    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);

       Iterator<Map.Entry<String,Double>>itr=fruitMap.entrySet().iterator();

       while(itr.hasNext()){
           //getting the entries from iterator
           Map.Entry<String,Double> entry=itr.next();
           //getting the keys and values from the Entry object
           if(entry.getKey().endsWith("e")|| entry.getValue()>=20){
               itr.remove();
           }
       }
        System.out.println(fruitMap);




    }
}
