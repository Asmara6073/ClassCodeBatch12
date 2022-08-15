package HackerRank;

import java.util.*;

public class CountOccurencesofWord {

    /**
     * Given a list of words count the occurences of each word in the List
     */


    public static Set<Map.Entry<String,Integer>>wordOccurences(List<String> words) {

        HashMap<String, Integer> wordCounts=new HashMap<>();

       for(String word:words){
           if(wordCounts.containsKey(word)){
               wordCounts.put(word,wordCounts.get(word)+1);
           }else{
               wordCounts.put(word,1);
           }
       }
        Set<Map.Entry<String,Integer>>entrySet=wordCounts.entrySet();
       

       return entrySet;

    }

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();

        names.add("Raee");
        names.add("Garfield");
        names.add("Leonard");
        names.add("Andrew");
        names.add("Tarik");
        names.add("Tarik");
        names.add("Tarik");
        names.add("Garfield");
        names.add("Raee");

        System.out.println(wordOccurences(names));



    }

}
