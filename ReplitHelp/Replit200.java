package ReplitHelp;


import java.util.LinkedHashMap;
import java.util.Map;

public class Replit200 {
    /*Create A Map that will preserve an order of entry objects
     *Add below pairs :
     *"Street" = "Patrick ST"
     * "Suite" = "265"
     * "City" = "Vienna"
     * "Zip" = "22180"
     * Country" = "United State"
     * Print all values of from the map
     * Expected Output:
         *Patrick ST
        *265
        *Vienna
        *22180
        * United State
     */
    public static void main(String[] args) {

        LinkedHashMap<String,String> entries=new LinkedHashMap<>();

        entries.put("Street","Patrick ST");
        entries.put("Suite","265");
        entries.put("City","Vienna" );
        entries.put("Zip","22180");
        entries.put("Country","United State");

        for(Map.Entry<String,String> value:entries.entrySet()){
            System.out.println(value.getValue());
        }




    }
}
