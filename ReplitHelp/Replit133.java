package ReplitHelp;

public class Replit133 {

    static int CountA(String s){
        int count=0;
        char occurence='a';
        char o2='A';
        for(int a=0;a<s.length();a++){
           if(s.charAt(a)==occurence|| s.charAt(a)==o2){
               count++;
            }
        }return count;
    }


    public static void main(String[] args) {
        System.out.println(CountA("Tarik"));

    }
}
