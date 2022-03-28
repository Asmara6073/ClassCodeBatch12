package com.syntax.class26;

public interface MoveAble {
    void move();
}
interface driveAble{
    void drive();
}
interface Car extends driveAble,MoveAble{

}

class BMW implements Car{


    @Override
    public void move() {
        System.out.println("we can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("we can drive the BMW");
    }
}

class CarTester{

    public static void main(String[] args) {
        driveAble car=new BMW();
        car.drive();
       // car.move(); can't use this method because it is not in interface driveAble
    }
}