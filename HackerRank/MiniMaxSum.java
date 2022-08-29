package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     */

    /**
     * Create a method that will take an array/List as argument with 5 positive integers
     * Iterate through the array and put them in order of least to greatest
     * For the min add the 4 smallest integers
     * For the max add the 4 largest integers
     */

    public static void miniMaxSum(int []  numbers){
        Arrays.sort(numbers);
        int maxSum=0;
        int minSum=0;
        for(int i=0;i<numbers.length-1;i++){
            minSum+=numbers[i];
        }
        for(int i=numbers.length-1;i>0;i--){
            maxSum+=numbers[i];
        }
        System.out.print(minSum+" "+maxSum);
    }

    public static void miniMaxSumLists(List<Integer> nums){
        Collections.sort(nums);
        long maxSum=0;
        long minSum=0;

      for(int i=0;i<nums.size()-1;i++){
          minSum+=nums.get(i);
      }// to get the minimum sum we need to sort all elements in ascending order and add all elements except for last

      for(int i=nums.size()-1;i>0;i--){
          maxSum+=nums.get(i);
      }// to get the maximum sum we need to sort all the elements in ascending order and add all elements starting from last one all
            // the way to second to last

        System.out.print(minSum+ " "+ maxSum);

    }

    public static void main(String[] args){

        int [] nums={9,3,7,8,5};

        miniMaxSum(nums);

     /*   List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(6);
        numbers.add(20);
        numbers.add(1);

        miniMaxSumLists(numbers);

      */

    }

}
