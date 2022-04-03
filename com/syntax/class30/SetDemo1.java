package com.syntax.class30;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetDemo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("Adam");
        arrayList.add("Anni");
        arrayList.add("Tyler");
        arrayList.add("Mike");

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<>(arrayList);
        System.out.println(treeSet);

       arrayList.clear();
       arrayList.addAll(treeSet);

        System.out.println(arrayList);

    }
}
