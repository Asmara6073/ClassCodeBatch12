package com.syntax.class22;

import java.util.Arrays;

public class HwTask1 {
}
// Rectangle area =WL
//Square area =w^2
//Box area= L*W*H
class Shapes{

    double width;
    double length;
    double height;



    double getArea(double length){
        this.length=length;
        double area=Math.pow(length,2);
        return area;
    }

    double getArea(double length, double width){
        this.width=width;
        double area=width*length;
        return area;
    }

    double getArea(double length, double width, double height){
        this.length=length;
        this.width=width;
        this.height=height;
        double area=length*width*height;
        return area;
    }

    public static void main(String[] args) {

        Shapes rectangle=new Shapes();
        System.out.println(rectangle.getArea(45,20));
    }



    }







