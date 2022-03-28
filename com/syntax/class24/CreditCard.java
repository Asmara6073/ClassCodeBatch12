package com.syntax.class24;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CreditCard {
    double balance;
    double interest;



    void calculateInterest(double balance, double interest){
        double interestRate=interest/100;
        System.out.println("The interest on your balance is :"+(balance*interestRate));
    }
}class Visa extends CreditCard{


}class AX extends CreditCard{

    @Override
    void calculateInterest(double balance, double interest) {
        super.calculateInterest(balance, interest+25);
    }

    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.calculateInterest(1000,20);
        Visa v= new Visa();
        v.calculateInterest(100,30);
        AX a =new AX();
        a.calculateInterest(100,10);
    }
}
