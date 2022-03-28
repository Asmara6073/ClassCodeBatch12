package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
     //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();

        cars.add("Ferrari");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("Lamborghini");
        cars.add("BMW");

        //method one to retrieve all of the values
        System.out.println(cars);

        //method two to retrieve all of the values(loops)
        for (String car:cars) {
            System.out.print(car+" ");
        }
        System.out.println();

        for(int i=0;i<cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }

        System.out.println();

        int i=0;
        while(i<cars.size()){
            System.out.print(cars.get(i)+" ");
            i++;
        }
        //method 3 to retrieve all of the values
        System.out.println();

        Iterator<String> itr=cars.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


    }
}
