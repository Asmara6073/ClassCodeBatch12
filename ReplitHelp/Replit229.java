package ReplitHelp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit229 {
    /**
     * Count the maximum occurance of a character examples are given below
     * "abscaaaaabdddd" -> 6
     */

    // create a map
    public static int countMaxChar(String str){
        HashMap<Character,Integer> charCountMap=new HashMap<>();
        char[]charArray=str.replaceAll(" ","").toCharArray();
        for(char c: charArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet=charCountMap.entrySet();
        int maxCount=0;
        char maxChar=0;
        for(Map.Entry<Character,Integer> entry:entrySet){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                maxChar= entry.getKey();
            }
        }
       return maxCount;
    }

    public static void main(String[] args) {
        /**String s = "aaffddf";
        HashMap<Character, Integer> charCountMap = new HashMap<>();// we will map each character to its count
        char[] charArray = s.replaceAll(" ", "").toCharArray();// convert string to charArray and removing the whitespace
        for (char c : charArray) {// loop through the char array
            if (charCountMap.containsKey(c)) {// check if the map contains the element of array as a key
                charCountMap.put(c, charCountMap.get(c) + 1);//if it does then we will increase the value by 1
            } else {
                charCountMap.put(c, 1);// if not then we will put the key in the map and give it value of one for first occurence
            }
        }
        // After getting the characters in a map and their count as values
        // we can go through the entry set to find maximum count
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        int maxCount = 0;// set max count to 0 initially and compare it to each value in the entry set
        for (Map.Entry<Character, Integer> entry : entrySet) {// loop through the entry set
            if (entry.getValue() > maxCount) {// if the value at the entry is greater than max count
                maxCount = entry.getValue();// then replace the max count with entry value that is largest
            }
        }
        System.out.println(maxCount);

         countMaxChar("aaaaabcccc");
         */
        

    }

}



