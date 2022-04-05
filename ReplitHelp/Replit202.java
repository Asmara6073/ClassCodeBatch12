package ReplitHelp;

import java.util.Map;
import java.util.TreeMap;

public class Replit202 {

    /*Create Map in which we want to store keys in Ascending order
      Add the below values
        1 item = apple
        2 item = banana
        3 item = pear
        4 item = tomato
        5 item = mango
        6 item: kiwi
      Extract all keys and it values and print them in the format below:
            Expected Output:
            Key is 1 item and values is apple
            Key is 2 item and values is banana
            Key is 3 item and values is pear
            Key is 4 item and values is tomato
            Key is 5 item and values is mango
            Key is 6 item and values is kiwi
     */

    public static void main(String[] args) {

        TreeMap<String,String> groceries=new TreeMap<>();

        groceries.put("1 item","apple");
        groceries.put("2 item","banana");
        groceries.put("3 item","pear");
        groceries.put("4 item","tomato");
        groceries.put("5 item","mango");
        groceries.put("6 item","kiwi");

        for(Map.Entry<String,String> grocery:groceries.entrySet()){
            System.out.println("Key is "+grocery.getKey()+" and values is "+grocery.getValue());
        }

    }


}
