package ReplitHelp;

import java.util.ArrayList;

public class Replit187 {
    /*Create an array list to type String.
    Add these values below to your arraylist
            hi
            yo
            sup
            yolo
            boop
    Remove 1, 3, 5 element from an array
    print remained values one by one in one line
        Expected Output:
            yo yolo
     */

    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        ArrayList<String>wordsToBeRemoved=new ArrayList<>();
        wordsToBeRemoved.add("hi");
        wordsToBeRemoved.add("sup");
        wordsToBeRemoved.add("boop");


        words.removeAll(wordsToBeRemoved);

        for(String word:words){
            System.out.print(word+" ");
        }


    }
}

