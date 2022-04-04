package com.syntax.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class OfficeBuildingMap {

    public static void main(String[] args) {

        HashMap<Integer,String> building=new HashMap<>();

        building.put(1,"Amazon");
        building.put(2,"Monsters Inc");
        building.put(3,"Krusty Krab");
        building.put(4,"Amazon");
        building.put(5,"Google");
        building.put(6,"Syntax");
        building.put(7,"Google");

        System.out.println(building.size());// used to get size of map
        building.replace(4,"Amazon","Insight");//used to update values
        building.remove(7);//used to remove 
        System.out.println(building);

    }
}
class CountryMaps{

    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington,DC");
        countries.put("Eritrea","Asmara");
        countries.put("Italy","Rome");
        countries.put("France","Paris");

        for(Map.Entry<String,String> entries: countries.entrySet()){
            System.out.println(entries.getKey()+": "+entries.getValue());
        }

        Iterator<Map.Entry<String,String>> itr=countries.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> entries=itr.next();
            System.out.println(entries.getKey()+": "+entries.getValue());
        }

    }

}
