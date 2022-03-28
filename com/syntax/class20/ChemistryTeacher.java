package com.syntax.class20;

public class ChemistryTeacher extends Teachers {

    void mix(){
        System.out.println(name+" is mixing chemicals");
    }

    public static void main(String[] args) {
        ChemistryTeacher c=new ChemistryTeacher();
        c.name="Bethann";
        c.mix();
        c.grading();
    }

}
