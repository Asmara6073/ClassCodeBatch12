package com.syntax.class34;

import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String[] args) {

        try {
            int[] a = null;
            System.out.println(a[0]);
        }catch(NullPointerException npe){
            System.out.println("Your array is null");
        }




    }

}
