package com.syntax.class25;

public class ToStringDemo {
    String name;
        int age;
        ToStringDemo(String name, int age){
            this.name=name;
            this.age=age;
        }

        public String toString(){
            return "Mr A show us your hand some face";
        }


    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Mr.a",10);
        System.out.println(toStringDemo.toString());


    }
    }


