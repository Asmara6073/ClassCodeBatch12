package com.syntax.class20;

public class PianoTeacher extends Teachers{

void playing(){
    System.out.println(name+" is playing the piano");
}

    public static void main(String[] args) {
        PianoTeacher p=new PianoTeacher();
        p.name="Abby";
        p.playing();
        p.grading();


    }

}
