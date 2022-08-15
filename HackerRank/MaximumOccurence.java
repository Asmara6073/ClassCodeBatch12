package HackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumOccurence {

    /**
     * Count the maximum occurance of a character examples are given below
     * "abscaaaaabdddd" -> 6
     */


    /**
     *
     * use split method to get all characters in the string and store them in an array
     * Store each element in a map and check if the map already contains
     * Create a set with entrySet of map and use counter to count each occurence
     *
     */

    public static void countMaximumOccurence(String s){
        HashMap<Character,Integer> map=new HashMap();

        char [] chars= s.replaceAll(" ","").toCharArray();

       for(char c:chars){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,1);
           }
       }

       // up until here we have taken all characters in the string and put them in our map paired with their number of occurence


        Set<Map.Entry<Character,Integer>> entrySet =map.entrySet();

       int maxCount=0;
       char maxChar = 0;

       for(Map.Entry<Character,Integer> entry:entrySet){
           if(entry.getValue()>maxCount){
               maxCount=entry.getValue();
               maxChar=entry.getKey();
           }
       }
        System.out.println(map.entrySet());

        System.out.println("The character the occurs the most is:"+maxChar+" and the amount of times that is occurs is:"+maxCount);

    }

    public static void main(String[] args) {

        countMaximumOccurence("I liiiiiiiiike frieeeeeees");


    }

}
