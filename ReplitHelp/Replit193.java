package ReplitHelp;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit193 {

    /*Create Linked List that will store Integer Objects
       Add the values below:
            111
            222
            333
            444
            555
            666
     Create a logic to calculate sum of the all the values in list.
     Print the result of sum.
        Expected Output:
            Result of sum is 2331
    */

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);


        Iterator<Integer> itr=numbers.iterator();
        int sum=0;
        while(itr.hasNext()){
            sum+=itr.next();
        }
        System.out.println("Result of sum is "+sum);
    }
}
