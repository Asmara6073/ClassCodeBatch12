package com.syntax.class25;

public abstract class File {

   void edit(){
       System.out.println("File is edited");
    }
    void close(){
        System.out.println("File has been closed");
    }
    abstract void open();

}

class JavaFile extends File{

    @Override
    void open() {
        System.out.println("Opened using sublime text");
    }
}

class WordFile extends File{

    @Override
    void open() {
        System.out.println("opened using Microsoft Word");
    }
}

class PdfFile extends File{

    @Override
    void open() {
        System.out.println("opened using Adobe");
    }


    public static void main(String[] args) {
    /*
    if a method is not present inside the parent class we can't call that method using polymorphism
     */
        File[]arr={new JavaFile(), new WordFile(),new PdfFile()};
        int i=0;
        while(i<arr.length){
            arr[i].open();
            arr[i].close();
            arr[i].edit();

            i++;

        }


    }
}
