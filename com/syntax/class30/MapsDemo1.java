package com.syntax.class30;

import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1234567,"Tarik Abraham");
        map.put(12345,"Abby Abraham");

        System.out.println(map.get(12345678));



        HashMap<String,String> groceries=new HashMap<>();

        groceries.put("Lilly","Eggs, milk, Bread,etc");
        groceries.put("Teyfur","Camel,Horse,CamelHorse");
        groceries.put("Asghar","Macbook,Iphone 13, Apple Monitor Stand for $1000");
        System.out.println(groceries.get("Lilly"));

    }
}
