package ReplitHelp;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;

public class Replit218 {



    public static List<String> deviceNamesSystem(List<String> deviceNames) {
        Map<String, Integer> newMap = new LinkedHashMap<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            if(newMap.containsKey(deviceNames.get(i))){
                newMap.put(deviceNames.get(i), newMap.get(deviceNames.get(i))+1);
                StringBuilder obj=new StringBuilder(deviceNames.get(i));
                obj.append(newMap.get(deviceNames.get(i)));
                deviceNames.set(i, obj.toString());
            }else{
                newMap.put(deviceNames.get(i),0);
            }
        }
        return deviceNames;

        }


    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("switch");
        list.add("remote");
        list.add("switch");
        list.add("remote");
        list.add("switch");
        list.add("remote");


        deviceNamesSystem(list);




    }
}
