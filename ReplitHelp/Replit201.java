package ReplitHelp;


import java.util.HashMap;

public class Replit201 {

    /*Create a Map in which you do not need to preserve the order of the entries
      Add below pair to it .
      "Street" = "Patrick ST"
      "Suite" = "265"
      "City" = "Vienna"
      "Zip" = "22180"
      "Country" = "United State"
      Find how many entries are inside the map
      Remove all entires from the Map
      Find the Map size again
        Expected Output:
            5
            0
     */
    public static void main(String[] args) {

        HashMap<String,String> entries=new HashMap<>();

        entries.put("Street","Patrick ST");
        entries.put("Suite","265");
        entries.put("City","Vienna");
        entries.put("Zip" ,"22180");
        entries.put("Country","United State");

        System.out.println(entries.size());
        entries.clear();
        System.out.println(entries.size());

    }


}
