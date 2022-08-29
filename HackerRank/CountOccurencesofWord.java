package HackerRank;

import java.util.*;

public class CountOccurencesofWord {

    /**
     * Given a list of words count the occurences of each word in the List
     */

    /*

    We will first declare a map of String,Integer so that way we are able to put a count everytime we input a certain word
    iterate through the list and if the word is not in the map already, then add it to the map with a value of one
    if it is in the map already then we will put the word and add one to the value. Then we will return the entry set
    of the map because it will tell us how many times a key was



     */


    public static Set<Map.Entry<String,Integer>> occuruncesOfWord(List<String>words){
        Map<String,Integer> wordCount=new HashMap<>();
        for( String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }else{
                wordCount.put(word,1);
            }
        }
       Set<Map.Entry<String,Integer>> entrySet= wordCount.entrySet();
        return entrySet;
    }


    public static Set<Map.Entry<String,Integer>>wordOccurences(List<String> words) {

        HashMap<String, Integer> wordCounts=new HashMap<>();// declare a map to put words in

       for(String word:words){
           if(wordCounts.containsKey(word)){
               wordCounts.put(word,wordCounts.get(word)+1);
           }else{
               wordCounts.put(word,1);
           }
       }
        Set<Map.Entry<String,Integer>>entrySet=wordCounts.entrySet();// entry set will return us each word and its value
       

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
