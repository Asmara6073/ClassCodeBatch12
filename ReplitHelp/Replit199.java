package ReplitHelp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Replit199 {
    /*Create a Set collection in which you want to preserve an order of inserted String Objects.
      Add the below values
            null
            Sohil
            Diego
            Alijon
            Asel
            Sumair
    Print values 1 by 1 using loop and Iterator
                null
                Sohil
                Diego
                Alijon
                Asel
                Sumair
                null
                Sohil
                Diego
                Alijon
                Asel
                Sumair
     */

    public static void main(String[] args) {

        LinkedHashSet<String> names=new LinkedHashSet<>();

        names.add(null);
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");


        for(String name:names){
            System.out.println(name);
        }

        Iterator<String> itr= names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }





}
