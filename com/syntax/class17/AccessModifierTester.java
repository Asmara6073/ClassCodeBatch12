package com.syntax.class17;

import com.syntax.classs18.AccessModifiers;

public class AccessModifierTester {
    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();
        //System.out.println(am.name); cant access name because it has private access
        //System.out.println(am.age); cant access age because it has default access
       // System.out.println(am.weight); cant access weight because it has protected access
        System.out.println(am.color);// we can access color because it has public access
    }

    }
