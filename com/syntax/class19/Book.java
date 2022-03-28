package com.syntax.class19;

public class Book {

    int pages;
    String color;
    double weight;
    String type;
    String difficulty;
    String genre;


    Book(int pages,String color,double weight){
        this.pages=pages;
        this.color=color;
        this.weight=weight;
    }
    Book(String type, String difficulty, String genre){
        this.type=type;
        this.difficulty=difficulty;
        this.genre=genre;
    }

    public static void main(String[] args) {
        Book b1=new Book(35,"Green",6);
        System.out.println(b1.pages);
        System.out.println(b1.color);
        System.out.println(b1.weight);

        Book b2=new Book("Hardcover","Extreme","Adventure Sports");
        System.out.println(b2.type);
        System.out.println(b2.difficulty);
        System.out.println(b2.genre);



    }

}
