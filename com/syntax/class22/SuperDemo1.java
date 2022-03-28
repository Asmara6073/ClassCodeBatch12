package com.syntax.class22;

public class SuperDemo1 {
}

class AAA{

}
class BBB{
    String name;
    BBB(){

    }
    BBB(String name){
        super();
       // this(); we can't use this() and super () indide the same constructor
        this.name=name;
    }
}

