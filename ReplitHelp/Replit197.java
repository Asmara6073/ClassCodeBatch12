package ReplitHelp;

import java.util.HashSet;

public class Replit197 {
    /*Create a set collection in which you do not want to preserve or sort the order and add below values to it.
            Red
            Pink
            Yellow
            White
            Black
      Print set collection
      And get total number of colors available in the set
            Expected Output:
            Original Hash Set: [Red, Pink, White, Yellow, Black]
            Size of the Hash Set: 5
     */


    public static void main(String[] args) {

        HashSet<String> colors=new HashSet<>();

        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original Hash Set: " +colors);
        System.out.println("Size of the Hash Set: "+colors.size());


    }



}
