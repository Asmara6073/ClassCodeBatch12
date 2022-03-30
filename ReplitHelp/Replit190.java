package ReplitHelp;

import java.util.LinkedList;

public class Replit190 {
    /*Create Linked List that will store first 10 numbers of fibonacci series
      Print number from Linked List 1 by 1 all in 1 line
      Expected Output:
            0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {

        LinkedList<Integer>fibbonaci=new LinkedList<>();

        int num1=0;
        int num2=1;
        for (int i = 1; i <= 10; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            fibbonaci.add(i);
        }


    }


}
