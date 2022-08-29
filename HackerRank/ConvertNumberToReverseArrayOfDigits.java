package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNumberToReverseArrayOfDigits {

    /**
     * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
     * 35231 => [1,3,2,5,3]
     */


    /*
    First we need to turn the number into a string and then reverse it
    Once it is revered we will use the spit method to turn it into an array
    loop through the array and parse the string into integer while adding each element into new integer array
     */



    public static int[] digitized(long number){
        String numberAsString=Long.toString(number).trim();
        int arrayIndex=numberAsString.length();
        StringBuilder stringBuilder=new StringBuilder(numberAsString);
        String [] numberAsStringArray=stringBuilder.reverse().toString().trim().split("");
        int [] numberAsInt=new int[arrayIndex];

        for(int i=0;i<numberAsStringArray.length;i++){

            numberAsInt[i]=Integer.parseInt(numberAsStringArray[i]);
        }


        return numberAsInt;

    }

    public static int[] digitize (long n){

       String numberAsString=Long.toString(n).trim();
       StringBuilder str=new StringBuilder(numberAsString);
       String [] reversedNumberAsStringArray=str.reverse().toString().trim().split("");
       int arraySize=numberAsString.length();
       int [] reversedNumber= new int[arraySize];
       for(int i=0;i< reversedNumberAsStringArray.length;i++){
          reversedNumber[i]=Integer.parseInt(reversedNumberAsStringArray[i]);
       }

       return reversedNumber;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitize(12345)));
        System.out.println(Arrays.toString(digitized(123456)));

}

}
