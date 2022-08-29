package HackerRank;

public class AddDigits {

    /**
     *Given n, take the sum of the digits of n.
     * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
     * The input will be a non-negative integer.
     *16  -->  1 + 6 = 7
     *  942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
     */


    public static int digital_root(int n){



        if(n>=9){
          if(n%9==0){
                return 9;
            }else{
                return n%9;
            }
        }else{
            return n;
        }


    }

    public static void main(String[] args) {

        System.out.println(digital_root(134657));


    }

}
