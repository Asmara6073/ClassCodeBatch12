package com.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BestBuyMap {
    /*Create a map of Best Buy store.
    Place item id and item name into it.
    Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */

    public static void main(String[] args) {

        HashMap<Integer,String> items=new HashMap<>();

        items.put(777888,"Hp Printer");
        items.put(777889,"Visio Flat Screen TV");
        items.put(888444,"Play Station 5");


        for(Map.Entry<Integer,String> item:items.entrySet()){
            System.out.println(item.getKey()+": "+item.getValue() );
        }
        System.out.println("------------------------------------------");
        Iterator<Map.Entry<Integer,String>>itr=items.entrySet().iterator();



        while(itr.hasNext()){
            Map.Entry<Integer,String> item=itr.next();
            System.out.println(item.getKey()+": "+item.getValue());
        }


    }
}
