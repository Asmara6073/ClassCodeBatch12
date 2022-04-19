package ReviewClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsDemo {

    public static void main(String[] args) {
        ArrayList<LinkedList<String>>complexData=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.add("Medine");
        linkedList.add("Daria");
        linkedList.add("Charles");

        LinkedList<String>  linkedList1=new LinkedList<>();

        linkedList1.add("Emila");
        linkedList1.add("Mr.A");
        linkedList1.add("Gulder");

        complexData.add(linkedList);
        complexData.add(linkedList1);

        System.out.println(complexData);


    }




}
