package HackerRank;

import java.util.*;

public class MaximumOccurence2 {


    /**
     * Given a list of words create a method that will return the name that occurs the most and count of how many times it occurs
     */


    public static Map.Entry<String,Integer> maxWordOccurence(List<String>names){

        HashMap<String,Integer> nameCount=new HashMap<>();
        for(String name:names){
            if(nameCount.containsKey(name)){
                nameCount.put(name,nameCount.get(name)+1);
            }else{
                nameCount.put(name,1);
            }
        }

        Set<Map.Entry<String,Integer>>entrySet=nameCount.entrySet();

        Map.Entry<String,Integer> maxEntry=null;
        int maxValue=Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry:entrySet){

            if(entry.getValue()>maxValue){
                maxValue=entry.getValue();
                maxEntry=entry;
            }
        }
        return maxEntry;
    }


    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Tarik");
        names.add("Tarik");
        names.add("Tarik");
        names.add("Tarik");
        names.add("Filmon");
        names.add("Filmon");
        names.add("Filmon");
        names.add("Paulos");
        names.add("Paulos");
        names.add("Aben");
        names.add("Bethann");

        System.out.println(maxWordOccurence(names));


    }

}
