package ReplitHelp;

public class Replit226 {

    /**
     * Reverse the String without using the Reverse method from the BtringBuilder Class
     */

    public static String reverse (String strToRev){

        String reversed= "";
        String [] strings = strToRev.split(" ");
        for(int i= strings.length-1;i>=0;i--){
            reversed+=strings[i]+" ";
        }
        return reversed;
    }

    public static String reverseString(String input){
        String reverse="";

        for (int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
       return reverse;
    }


    public static void main(String[] args) {
        System.out.println(reverse("Hi How Are"));

        int i= 276;
      String num=Integer.toString(i);

    }
}
