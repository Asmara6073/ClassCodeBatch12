package com.syntax.class16;

public class Task5_6 {

//How would you check if String is palindrome or not?
// aba=> true
//Abbc =>false

     void swapString(String x, String y){
       x=x+y;
       y=x.substring(0,x.length()-y.length());
      x=x.substring(y.length());
        System.out.println("After swapping the strings, String x is now:"+x+" and String Y is now: "+y);
    }
    Boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }
    String reverseString(String inputString){
        //converting String to Stringbuilder
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
}

    public static void main(String[] args) {
        Task5_6 task=new Task5_6();

        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Hello"));

        //How would you swap 2 strings without a temporary variable?

        Task5_6 task6=new Task5_6();
        task6.swapString("Hi","Love");

    }

}

