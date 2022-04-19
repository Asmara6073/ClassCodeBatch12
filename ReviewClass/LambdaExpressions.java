package ReviewClass;

import java.util.ArrayList;

public class LambdaExpressions {

    public static void main(String[] args) {

        ArrayList<String>arrayList=new ArrayList<>();

        arrayList.add("orsan");
        arrayList.add("NAssir");
        arrayList.add("Mujeeb");
        arrayList.add("Tolga");

       long m= arrayList.stream().filter(x->x.contains("M")).count();
        System.out.println(m);



    }

}
