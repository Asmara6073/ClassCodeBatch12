package ReplitHelp;

public class Replit225 {
    /**
     * Reverse the number
     * Input[123] ->output [321]
     */

    public static int reverseInteger(int N){

       String num=Integer.toString(N);
       StringBuilder stringBuilder=new StringBuilder(num);
       String reversedNumString=stringBuilder.reverse().toString();
       int reversedN=Integer.parseInt(reversedNumString);
        return reversedN;
    }


    public static void main(String[] args) {

        System.out.println(reverseInteger(173298));


    }

}
