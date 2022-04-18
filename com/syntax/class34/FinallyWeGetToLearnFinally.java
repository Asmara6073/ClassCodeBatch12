package com.syntax.class34;

import java.util.Scanner;

public class FinallyWeGetToLearnFinally {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        try{
            System.out.println(scan.next());
        }catch(Exception e){
            System.out.println(e);
        }finally {
            scan.close();
        }
    }
}
