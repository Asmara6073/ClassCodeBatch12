package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {




        ArrayList<Insurance> insurance=new ArrayList<>();

        insurance.add(new Car("Geico","BMW"));
        insurance.add(new Pet("Petco","Dog"));
        insurance.add(new Health("Medstar"));

       for(int i=0;i< insurance.size();i++){
           insurance.get(i).getQuote();
           insurance.get(i).cancelInsurance();
       }

        System.out.println("***************************************************");

        for (Insurance i:insurance) {
            System.out.println(i);
           i.getQuote();
            i.cancelInsurance();
        }
        System.out.println("****************************************************");
        Iterator<Insurance> itr= insurance.iterator();

       while(itr.hasNext()){
           Insurance i=itr.next();
           i.getQuote();
           i.cancelInsurance();
        }










    }


}
