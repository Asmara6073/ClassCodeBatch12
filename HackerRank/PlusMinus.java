package HackerRank;

import java.text.DecimalFormat;

public class PlusMinus {

    /**
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
     * Print the decimal value of each fraction on a new line with 6 places after the decimal.
     */

    /**
     * Create a method that takes an array of integers as an argument
     *Figure out how many of its elements are positive, negative, or 0
     * Figure out the ratio of each type of element (pos,neg,0) and print it in decimal format
     */

    public static void plusMinus(int [] arr){
        double positiveElement=0;
        double negativeElement=0;
        double zeroElement=0;
        int arrSize=arr.length;
        for(int i=0;i<arrSize;i++){

            if(arr[i]>0){// if element in array is above 0 count one for positive
                positiveElement=positiveElement+1;
            }else if(arr[i]<0){// if element in array is below 0 count one for negative
                negativeElement=negativeElement+1;
            }else {// if element is not above 0 or below 0 then it must be 0
                zeroElement=zeroElement+1;
            }
        }

        DecimalFormat df=new DecimalFormat("#.######");// using to format decimal
        System.out.println(df.format(positiveElement/arrSize));
        System.out.println(df.format(negativeElement/arrSize));
        System.out.println(df.format(zeroElement/arrSize));

    }

    public static void main(String [] args){

    int [] numbers={2,4,6,8,0,0,0,-2,-4,-6 };

    plusMinus(numbers);



    }

}
