package ReplitHelp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit207 {

    /**Create Hash Map.
     add the follow values
     map.put("ONE","AAA");
     map.put("TWO","BBB");
     map.put("THREE","CCC");
     map.put("FOUR","DDD");
     map.put("FIVE","EEE");
     Using EntrySet print the key and values pairs using iterator only
     replace with below key THREE--> ASEL and key FIVE-->SUMAIR
     Using EntrySet print the key and values pairs using iterator only
     OUTPUT
     HashMap Before Replace :
     FIVE : EEE
     ONE : AAA
     FOUR : DDD
     TWO : BBB
     THREE : CCC
     ------------------
     HashMap After Replace :
     FIVE : SUMAIR
     ONE : AAA
     FOUR : DDD
     TWO : BBB
     THREE : ASEL
     */

    public static void main(String[] args) {

        HashMap<String,String> maps=new HashMap<>();
        maps.put("ONE","AAA");
        maps.put("TWO","BBB");
        maps.put("THREE","CCC");
        maps.put("FOUR","DDD");
        maps.put("FIVE","EEE");

        Iterator<Map.Entry<String,String>> itr=maps.entrySet().iterator();
        System.out.println("HashMap Before Replace :");
        while(itr.hasNext()){
            Map.Entry<String,String> entries=itr.next();
            System.out.println(entries.getKey()+" : "+entries.getValue());
        }

        maps.replace("THREE","CCC","ASEL");
        maps.replace("FIVE","EEE","SUMAIR");

        System.out.println("------------------");

        Iterator<Map.Entry<String,String>> itr2=maps.entrySet().iterator();
        System.out.println("HashMap After Replace :");
        while(itr2.hasNext()){
            Map.Entry<String,String>entry=itr2.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
