package ReplitHelp;

import java.util.Arrays;

public class Replit216 {
/**
 * Create an Array of size N whose elements sum to zero
 * ArraySumToZero(0) ->{}
 * ArraySumToZero(1) ->{0}
 * ArraySumToZero(2) ->{-1,1}
 * ArraySumToZero(3) ->{1,-1,0}
 * ArraySumToZero(4) ->{2,-2,3,-3}
 * N will be given as input to the function and fucntion will return an array whose element will sum to zero.
 */



public static int[] arraySumToZero(int N) {
    if(N==1){
        //if N is 1 the only way the sum of 1 element will be 0 is if the element itself is 0
        return  new int[]{0};
    }
    int num = N/2;// declaring two elements at a time so we need to half the number of elements for iterations
    int[] res = new int[N];// create an array with N number of elements
    int index=0;
    while(num>0){
        res[index++]=num;// declaring first element
        res[index++]=num *-1;// declaring the negative version of first element
        num--;
    }
    if(N%2!=0){
        res[res.length-1]=0;// if N is not even then the last element in array is 0
    }
    return res;
}

    public static void main(String[] args) {
        arraySumToZero(5);

        int num=3;
        num++;
        System.out.println(num);
    }
}





