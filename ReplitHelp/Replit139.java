package ReplitHelp;

public class Replit139 {

   public String alphabetical(String str){
        String newStr=""+str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1)<str.charAt(i)){
                newStr+=str.charAt(i);
            }
        }return newStr;
    }

    public static void main(String[] args) {
        Replit139 obj=new Replit139();
        System.out.println(obj.alphabetical("hello"));
    }






}

