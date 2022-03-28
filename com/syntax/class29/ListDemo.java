package com.syntax.class29;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("10");
        arrayList.add("Tarik");
        //arrayList.add(10.5);
       // arrayList.add(true);


        for(int i=0;i<arrayList.size();i++){
            System.out.println(((String)arrayList.get(i)).length());
        }
        System.out.println(arrayList);
    }
}
