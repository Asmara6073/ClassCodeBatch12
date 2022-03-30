package ReplitHelp;

import java.util.ArrayList;

public class Replit184 {

    /* Create a array list that will hold Integer Objects:
        Add below elements to it.
        111
        222
        333
        444
        555
        666
       Print first, third and fifth element from your array
       Expected Output:
        111
        333
        555
     */

    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(4));
    }
}
