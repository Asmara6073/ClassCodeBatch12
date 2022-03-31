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

        fibbonaci.add(0);
        fibbonaci.add(1);
        fibbonaci.add(1);
        fibbonaci.add(2);
        fibbonaci.add(3);
        fibbonaci.add(5);
        fibbonaci.add(8);
        fibbonaci.add(13);
        fibbonaci.add(21);
        fibbonaci.add(34);

        for(Integer numbers:fibbonaci){
            System.out.print(numbers+" ");
        }

    }


}
