package ReplitHelp;

import java.util.HashSet;

public class Replit196 {
   /* Create a Set and and below values to it.
   [third, first, second]
   Print HashSet and then remove all the elements from Hashset and print it again.
            Expected Output:
            [third, first, second]
            []
    */

    public static void main(String[] args) {


        HashSet<String> words=new HashSet<>();
        words.add("third");
        words.add("first");
        words.add("second");

        System.out.println(words);

        words.clear();
        System.out.println(words);





    }
}
