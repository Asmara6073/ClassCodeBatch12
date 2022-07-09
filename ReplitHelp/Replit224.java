package ReplitHelp;

import java.util.ArrayList;

public class Replit224 {

    /*
    Remove Consecutive duplicates Write the logic to remove only consecutive duplicates
    input ["aabbcde"]-> output["abcde"]
    input ["aabbcc"]-> output["abc"]
     */

    /**
     * create new empty string
     * if the input String is 1 or less than there cannot be duplicates so return the input the way it is
     * add the first character of string to the new string
     * looping through input String and checking to see if previous character is the same as current
     * if it is not the same then add it to new string
     * return new string
     */

    public static String removeConsecutiveDuplicates1(String input) {


        String result="";

        if (input.length()<=1){// if our string has 1 or less characters then there cannot be duplicates so we return it
                                // the way that it is
            return input;
        }

        result+=input.charAt(0);// adding first letter to our result string
        for(int i=1;i<input.length();i++){
            if(input.charAt(i-1)!=input.charAt(i)){// checking if characters before is the same
                result+=input.charAt(i);// if not then we add it to our result string
            }
        }

        return result;
    }

    public static String removeConsecutiveDuplicates(String input) {

        char[] chars = input.toCharArray();
        ArrayList noDup = new ArrayList();

        String newInput = null;
        if (input.length() <= 1) {
            return input;
        } else if (input.length() > 1) {
            noDup.add(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i - 1] == chars[i]) {
                    continue;
                } else {
                    noDup.add(chars[i]);
                }

            }
            newInput = noDup.toString();
        }
        return newInput;
    }


    public static void main(String[] args) {


        System.out.println(removeConsecutiveDuplicates("aaaabbbccc"));

        System.out.println(removeConsecutiveDuplicates1("aaaaabbbccccddd"));
    }

}
