package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {




        ArrayList<Insurance> insurance=new ArrayList<>();

        insurance.add(new Car("BMW","Geico"));
        insurance.add(new Pet("Dog","Blue Cross"));
        insurance.add(new Health("Dental","Medstar"));

       for(int i=0;i< insurance.size();i++){
           insurance.get(i).getQuote();
           insurance.get(i).cancelInsurance("Aflac");
       }

        System.out.println("***************************************************");

        for (Insurance i:insurance) {
           i.getQuote();
            i.cancelInsurance("Medstar");
        }
        System.out.println("****************************************************");
        Iterator<Insurance> itr= insurance.iterator();

       while(itr.hasNext()){
           itr.next().getQuote();
        }
        System.out.println("****************************************************");

       Iterator<Insurance>itr2=insurance.iterator();

       while(itr2.hasNext()){
           itr2.next().cancelInsurance("Geico");
       }









    }


}
