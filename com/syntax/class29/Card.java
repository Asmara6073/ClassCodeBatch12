package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Card {

    /*Create a Card class that will have implemented  and unimplemented methods.
     and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
String cardType;

Card(String cardType){
    this.cardType=cardType;
}

void swipe(){
    System.out.println(cardType+" has been swiped for payment");
}

void tap(){
    System.out.println(cardType+" has been tapped for payment");
}

abstract void cashback();

abstract void paymentDate();

}

class PNCCashRewards extends Card{


    PNCCashRewards(String cardType) {
        super(cardType);
    }

    @Override
    void cashback() {
        System.out.println(cardType+" has cashback of 4% on all purchases");
    }

    @Override
    void paymentDate() {
        System.out.println(cardType+" due date is the 5th of the month");
    }
}
class AmericanExpress extends Card{


    AmericanExpress(String cardType) {
        super(cardType);
    }

    @Override
    void cashback() {
        System.out.println(cardType+" has cashback of 3% on all purchases");
    }

    @Override
    void paymentDate() {
        System.out.println(cardType+" due date is the 3rd of the month");
    }
}

class Discover extends Card{

    Discover(String cardType) {
        super(cardType);
    }

    @Override
    void cashback() {
        System.out.println(cardType+" has cashback of 2% on all purchases");

    }

    @Override
    void paymentDate() {
        System.out.println(cardType+" due date is the 15th of the month");
    }
}

class CardTester{

    public static void main(String[] args) {
        Card pnc=new PNCCashRewards("PNC cash reward");
        Card americanExpress=new AmericanExpress("American Express");
        Card discover=new Discover("Discover");

        LinkedList<Card> cards=new LinkedList<>();

        cards.add(pnc);
        cards.add(americanExpress);
        cards.add(discover);

        for(int i=0;i<cards.size();i++){
            cards.get(i).cashback();
            cards.get(i).paymentDate();
        }


        for(Card card:cards){
            card.cashback();
            card.paymentDate();
        }

        Iterator<Card> itr=cards.iterator();

        while(itr.hasNext()){
            itr.next().cashback();

        }

        Iterator<Card> itr2=cards.iterator();

        while(itr2.hasNext()){
            itr2.next().paymentDate();
        }



    }

}
