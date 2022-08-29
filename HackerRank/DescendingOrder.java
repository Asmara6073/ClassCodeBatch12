package HackerRank;

import java.util.Arrays;

public class DescendingOrder {

    /*

    Your task is to make a function that can take any non-negative integer
    as an argument and return it with its digits in descending order.
    Essentially, rearrange the digits to create the highest possible number.

    Input: 42145 Output: 54421

     */

    /**
     *
     * Takes an integer and converts into an array of Strings
     * Then takes that array of Strings and sorts it (ascending order)
     * Converts array of Strings back to array and reverse it using stringbuilder
     *
     *
     * @param num
     * @return
     */








    public static int  sortDesc(final int num){
        int descOrderNumber;
        if(num<0){
            return num;
        }else{
            String numberAsString=Integer.toString(num);
            String [] numberAsArray=numberAsString.split("");
            Arrays.sort(numberAsArray);
            String sortedNumberAsString=Arrays.toString(numberAsArray)
                                              .replaceAll(",","")
                                              .replaceAll("]","")
                                              .replaceAll("\\[","")
                                              .replaceAll(" ","");

            StringBuilder stringBuilder=new StringBuilder(sortedNumberAsString);
            String descNumberAsString=stringBuilder.reverse().toString().trim();
            descOrderNumber=Integer.parseInt(descNumberAsString);
            return descOrderNumber;
        }

    }

    public static void main(String[] args) {


    }


}
