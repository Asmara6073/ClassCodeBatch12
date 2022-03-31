package ReplitHelp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Replit194 {

   /* Create a method that will remove an element based on the specified condition from given List and return new List;
         Expected Output:
         [USA, Kazakhstan, Pakistan, Russia]
*/
    public static List removeA(List <String> withA){
        List <String> withoutA=new LinkedList<>(withA);
        Iterator<String> itr= withoutA.iterator();

        while(itr.hasNext()){
            if(itr.next().startsWith("A")){
                itr.remove();
            }

        }
        return withoutA;
    }

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(Replit194.removeA(countries));




    }
}
