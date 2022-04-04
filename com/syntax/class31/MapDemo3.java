package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class MapDemo3 {
    public static void main(String[] args) {


        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);

        Collection<Double> values=fruitMap.values();
        System.out.println(values);

        Iterator<Double> itr=values.iterator();

        while(itr.hasNext()){
            if(itr.next()>=20){
                itr.remove();
            }
        }
        System.out.println(values);

    }



}
