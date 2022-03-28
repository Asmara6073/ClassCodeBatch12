package com.syntax.class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> namesLinkedList=new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"Jerry");

        ArrayList<String>namesArrayList=new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2) );


        //For large lists use ArrayList when you need to retrieve values frmo a static list
        // For large lists use LinkedList when you have a more dynamic list where you are adding/removing constantly


    }


}
