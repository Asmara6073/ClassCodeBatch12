package com.syntax.class24;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need highschool diploma");
    }
}class Bachelors extends Degree{

}
class Masters{
    void getPrerequisite(){
        System.out.println("Get your bachelors to get a masters");
    }

    public static void main(String[] args) {
        Degree d = new Degree();
        d.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();

    }

}
