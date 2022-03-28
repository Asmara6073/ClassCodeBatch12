package com.syntax.classs18;

public class Task1 {

    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.

    void sumOfArray(int [] arr) { // VOID METHOD
        int sum = 0;
        for ( int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    int sumArray(int [] array){ // RETURN METHOD
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }


    public static void main(String[] args) {

        Task1 obj1=new Task1();
        int [] task={10,20,30,40};
        obj1.sumOfArray(task);

        Task1 obj2=new Task1();
        int [] array={10,10,10};
        System.out.println(obj2.sumArray(array));
    }


}
