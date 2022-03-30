package ReplitHelp;

import java.util.ArrayList;

public class Replit185 {
    /*Create an arrayList of type Integer.
        add below values:
            111
            111
            111
            999
            999
            999
     Print all the values of List 1 by 1:
     Expected Output:
            111
            111
            111
            999
            999
            999
     */
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for(Integer number:numbers){
            System.out.println(number);
        }

    }
}
