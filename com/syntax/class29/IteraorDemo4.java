package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteraorDemo4 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        Iterator<String> iterator=courses.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Java")){
                iterator.remove();
            }
        }
        System.out.println(courses);

        /*When you are doing any operations on list that can change its size-> Use iterators
            Otherwise you can use loops
         */

}
}
