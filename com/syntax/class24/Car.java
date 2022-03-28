package com.syntax.class24;

public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use breaks to stop me");

    }
    void park(){
        System.out.println("park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("start me with button");
    }
    void stop(){
        System.out.println("can use breaks or i can autobreak");
    }
    void park(){
        System.out.println("use parking sensors to park me");
    }
}

class Tesla extends Car{

    void start(){
        System.out.println("start me with App or remote");
    }
    void stop(){
        System.out.println("can use breaks or i can autobreak");
    }
    void park(){
        System.out.println("use parking sensors or I can auto park");
    }
}

class Suzuki extends Car{
    void start(){
        System.out.println("push me to start");
    }

    void stop(){
        System.out.println("I lost my breaks and tires on the way");
    }
}

















