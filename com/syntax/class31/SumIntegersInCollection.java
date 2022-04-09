package com.syntax.class31;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.LinkedList;

public class SumIntegersInCollection {

    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        int sum = 0;
        for(Integer num:numbers){
            sum+=num;

        }
        System.out.println(sum);

        int sum2=0;
        for(int i=0;i<numbers.size();i++){
            sum2+=numbers.get(i);
        }

        System.out.println(sum2);

    }


}
