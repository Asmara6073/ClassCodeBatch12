package com.syntax.class27;

import java.util.ArrayList;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        // Not scalable if we have to store large amount of data
        // Arrays can be good option to tackle this problem

       // String []names={"Yazgul","Andrew"};
      //  names[2]="Teyfur";
       // String[] names2=new String[1000];
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList--> Name of the class
        //<> --> diamond operator
        // String --> datatype
        //syntaxStudents
        syntaxStudents.add("Tarik");
        syntaxStudents.add("Abeselom");
        syntaxStudents.add("Mike");
       // System.out.println(syntaxStudents);

        for(String x:syntaxStudents){
            System.out.print(x+" ");
            }

        }

    }

