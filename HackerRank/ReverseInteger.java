package HackerRank;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class ReverseInteger {

    /**
     * Reverse the number
     * Input[123] ->output [321]
     */

    public static int reverseInteger(int a){

        String number= Integer.toString(a);
        StringBuilder str=new StringBuilder(number);
        String reversed = str.reverse().toString();

        int reversedInteger= Integer.parseInt(reversed);
        return reversedInteger;
    }

    public static void main(String[] args) {

        System.out.println(reverseInteger(1002));

    }

}
