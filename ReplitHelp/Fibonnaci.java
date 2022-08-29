package ReplitHelp;

public class Fibonnaci {

    /*
    Fibbonnacci series starts with 0 and 1 and the next term is always the two numbers before it added up
        0,1,1,2,3,5,8,13

        first term=0
        second term=1
        nextTerm=1
     */




    public static void fibonnaciSeries(int number){
        int firstTerm=0;
        int secondTerm=1;
        int nextTerm;
        for(int i=1;i<=number;i++){
            System.out.print(firstTerm+ " ");
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }



    }


    public static void main(String[] args) {

        fibonnaciSeries(10);


    }



}class SingletonObject{

    private static SingletonObject obj;

    private SingletonObject(){}





}







