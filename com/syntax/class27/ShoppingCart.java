package com.syntax.class27;

public class ShoppingCart {
    double originalPrice;
    double discount=.15;

    void calculatePrice(){
        double price=originalPrice-(originalPrice*.15);
        System.out.println(price);
    }


}
