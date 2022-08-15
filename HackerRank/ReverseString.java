package HackerRank;

public class ReverseString {
    /**
     * Method 1
     * Reverse the String without using the Reverse method from the StringBuilder Class
     */

    /**
     *Method 2
     *Reverse the string using Stringbuilder Class
     */


    /**
     * split the string and make it into an array of letters
     * iterate the letters backwards while putting them into a new String
     * @param  s
     * @return String reversedWord
     */
    public static String reverseStringwithoutStringBuilder(String s){
        String [] letters= s.split("");
        String reversedWord="";
        for(int i=letters.length-1;i>=0;i--){
            reversedWord+=letters[i];
        }
        return reversedWord;
    }

    public static String reverseString(String s){

        StringBuilder str=new StringBuilder(s);
        String reversedWord=str.reverse().toString();
        return reversedWord;
    }

    public static void main(String[] args) {


        System.out.println(reverseStringwithoutStringBuilder("Tarik"));
        System.out.println(reverseString("Tarik"));



    }



}
