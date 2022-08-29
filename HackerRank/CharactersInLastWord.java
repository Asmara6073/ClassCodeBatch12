package HackerRank;

public class CharactersInLastWord {

/**
 * Count the number of characters in the last word of a String
 * "I love Java" => 4
*/

/**
 * split the string into an array by word and count the last elements size
 */

 public static int lastWordofStringCount(String s){
 String [] array=s.split(" ");// split the string into an array  by spaces in between each word so each word is a seperate element
 int countOfLastWord=array[array.length-1].length();// to find length of last word use indexing and then length method
 return countOfLastWord;
}




public static void main(String [] args){


 System.out.println(lastWordofStringCount("I love Java"));



}

 }
