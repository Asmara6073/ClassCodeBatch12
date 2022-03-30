package ReplitHelp;

import java.util.ArrayList;

public class Replit186 {
    /*Create an Arraylist of type Integer.
      Add below elements to it.
        111
        222
        333
        444
        555
        666
   Print the ArrayList.
   Remove all the elements.
   Print the Arraylist.
     */
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);

        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);
    }



}
