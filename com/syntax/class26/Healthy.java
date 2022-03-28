package com.syntax.class26;

import javax.sound.sampled.Port;

public interface Healthy {

    void Healthy();

}

interface Portable{
    void canCarry();
}

interface Eatable{
    void eat();
}

class Apple implements Healthy, Portable,Eatable {


    @Override
    public void Healthy() {
        System.out.println("Apple is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.println("we can carry apple easily");
    }

    @Override
    public void eat() {
        System.out.println("we can eat apple");
    }
}

class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("we can carry laptop easily");
    }
}