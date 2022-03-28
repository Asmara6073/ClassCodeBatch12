package com.syntax.class27;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("Eritrea");
        countries.add("Turkey");
        countries.add("Morrocco");
        countries.add("Iraq");
       // System.out.println(countries.get(0));
        System.out.println(countries);
        countries.add(3,"Pakistan");// inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);
    }

}
