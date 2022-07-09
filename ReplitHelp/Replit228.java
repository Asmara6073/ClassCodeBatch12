package ReplitHelp;

import java.util.ArrayList;
import java.util.List;

public class Replit228 {

    /**
     * Count the number of characters in the last word of a String
     * "I love Java" => 4
     */
    /**
     * store each word in the string in an array
     * get the last entry and get the length
     *
     */

    public static int countLastWordChar(String str){
        String [] strings=str.split(" ");
            int countLastWord=strings[strings.length-1].length();;
            return countLastWord;
    }


    public static void main(String[] args) {

        System.out.println(countLastWordChar("I love Java"));

    }

}
