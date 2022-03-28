package com.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {








        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);


    }

}
