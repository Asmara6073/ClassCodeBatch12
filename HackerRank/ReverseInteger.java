package HackerRank;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.Arrays;
import java.util.Collections;

public class ReverseInteger {

    /**
     * Reverse the number
     * Input[123] ->output [321]
     */

    public static int reverseNumber(int number){

        String numberAsString=Integer.toString(number);
        StringBuilder stringBuilder=new StringBuilder(numberAsString);
        String reversedNumberString=stringBuilder.reverse().toString().trim();

        int reversedNumber=Integer.parseInt(reversedNumberString);
        return reversedNumber;




    }



    public static int reverseInteger(int a){

        String number= Integer.toString(a);
        StringBuilder str=new StringBuilder(number);
        String reversed = str.reverse().toString();

        int reversedInteger= Integer.parseInt(reversed);
        return reversedInteger;
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(123455));


    }

}
