package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("b");
        fruit.add("g");
        fruit.add("d");
        fruit.add("z");

        Iterator<String> itr=fruit.iterator();
        System.out.println(itr.next());


}
}
