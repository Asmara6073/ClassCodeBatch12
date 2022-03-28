package com.syntax.class22;

public class OverloadTask {


    static String findRestaurant(int numOfReviews, double rating){
        String bethannDecision="";
        if(numOfReviews>200&& rating>4){
            bethannDecision="Then Bethann's hungry self wants to eat there";
        }else{
            bethannDecision="Bethann is not impressed";
        }return bethannDecision;
    }

    static String findRestaurant(int hours){
        String bethannDecision="";
        if(hours>10){
            bethannDecision="We can eat there";
        }else {
            bethannDecision="I am not eating there";
        } return bethannDecision;
    }

    static String findRestaurant(boolean hasSweetPotatoes, double rating, double distance){
        String bethannDecision="";
        if ( rating>4&&distance<5){
            if(hasSweetPotatoes){
                bethannDecision="I'll eat here";
            }else{
                bethannDecision="So close, but I want sweet potatoe fries";
            }
        }else{
            bethannDecision="not worth my time";
        }return bethannDecision;
    }


    public static void main(String[] args) {
        System.out.println(findRestaurant(201, 4.001));
        System.out.println(findRestaurant(11));
        System.out.println(findRestaurant(true,4.2,3.9));

    }

}
