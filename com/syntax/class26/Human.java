package com.syntax.class26;

public interface Human {
    // public static final is redundant because by default all the variables are public static final
    //public static final int legs=2;
    int legs=2;

    void walk();
    static void printLegs(){
        System.out.println(legs);
    }


}

class Maha implements Human{


    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        Human.printLegs();
    }

}
