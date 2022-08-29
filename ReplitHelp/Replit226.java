package ReplitHelp;

public class Replit226 {

    /**
     * Reverse the String without using the Reverse method from the BtringBuilder Class
     */


   /*
   Write a method that will reverse the words order in a String as well as the letters in the string
    */


    public static String completeReverse (String strToReverse){

        StringBuilder stringBuilder=new StringBuilder(strToReverse);

        String reversedString=stringBuilder.reverse().toString().trim();

        return reversedString;
    }

    public static String reverse (String strToRev){

        String reversed="";
        String [] strings = strToRev.split(" ");
        for(int i= strings.length-1;i>=0;i--){
            reversed+=strings[i]+" ";
        }
        return reversed.trim();
    }

    public static String reverseString(String input){
        String reverse="";

        for (int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
       return reverse;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("Hi How Are"));
        System.out.println(completeReverse("Hi How Are You"));

        int i= 276;
      String num=Integer.toString(i);

    }
}
