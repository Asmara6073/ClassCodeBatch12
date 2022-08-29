package HackerRank;

public class YoureASquare {
    /**
     *Given an integral number, determine if it's a square number:
     *
     * 4  =>  true
     */



    public static boolean square(int n){

        if(n<0){
            return false;
        }

      int sqrRoot=(int) Math.sqrt(n);

        if(Math.pow(sqrRoot,2)==n){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSquare(int n){
        if (n < 0) {
            return false;
        }else{
            int sqr= (int)Math.sqrt(n);
            if(Math.pow(sqr,2)==n){
                return true;
            }else{
                return false;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(square(2));


    }
}
