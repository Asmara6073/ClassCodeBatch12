package ReplitHelp;

public class Replit168 {
    //Create an instance final method that will reverse a String and return that new String
    //
    //Call method from the main method


    final  String reverse(String x){
        String newStr="";
        StringBuilder b=new StringBuilder(x);
        b.reverse();
        newStr=b.toString();
        return newStr;
    }


    public static void main(String[] args) {

        Replit168 x=new Replit168();
        System.out.println(x.reverse("hello"));


    }






}
