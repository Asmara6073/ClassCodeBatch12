package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public class RemovingCitiesStartingWithA {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */

    public static void main(String[] args) {
        LinkedHashSet <String> cities=new LinkedHashSet<>();

        cities.add("Washington");
        cities.add("Albany");
        cities.add("Miami");
        cities.add("Anchorage");
        cities.add("Milano");

        Iterator<String> itr=cities.iterator();
        while(itr.hasNext()){
            if(itr.next().toLowerCase().startsWith("a")){
                itr.remove();
            }
        }
        System.out.println(cities);

    }

}
