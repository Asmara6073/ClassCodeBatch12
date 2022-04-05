package ReplitHelp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit203 {

    /*Create HashMap
     add values as below
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
    Using iterator retrieve all keys and values if the format below:
            Expected Output:
                Key = orange and value = 20
                Key = apple and value = 30
                Key = mango and value = 40
     */

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        Iterator<Map.Entry<String,Integer>> itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,Integer> entries=itr.next();
            System.out.println("Key = "+entries.getKey()+" and value = "+entries.getValue());

        }

    }

}
