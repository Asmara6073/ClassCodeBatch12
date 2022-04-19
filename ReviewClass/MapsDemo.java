package ReviewClass;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {


        HashMap<Integer,String> personInfo=new HashMap<>();

        personInfo.put(11111111,"Manana");
        personInfo.put(123456,"Gulden");
        personInfo.put(456665,"Salim");
        personInfo.put(865565,"Pot");


        for(Map.Entry<Integer,String> entry:personInfo.entrySet()){
            System.out.println(entry);
        }





    }

}
