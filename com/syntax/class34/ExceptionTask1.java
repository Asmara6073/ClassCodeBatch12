package com.syntax.class34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask1 {

    /**
     *  How would handle InputMismatchException?
     * Input Mismatch Exception when user enters mismatch value then programmer expected.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        try{
            System.out.println("Please enter a whole number");
            int num=scan.nextInt();
            System.out.println("The number you entered is "+ num);

        }catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("you have entered the wrong type of input, please only a WHOLE NUMBER");
        }

        scan.close();



    }
}
