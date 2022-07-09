package ReplitHelp;

import java.util.ArrayList;
import java.util.List;

public class Replit222 {

    /*
    Write the logic that picks largest and second largest numbers from a list add them and return the results.
    input to method is a list that contains the numbers input [10,20,30,40]
    output [70]
     */
    public static int findMaxSum(List<Integer> list) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int sumOfMaxAndSecondMax=0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > highest) {// if we find a new highest number
                secondHighest = highest;// then we need to shift the current highest number to be the second highest
                highest = list.get(i);// new highest
            } else if (list.get(i) > secondHighest) {
                secondHighest = list.get(i);
            }
        }
        sumOfMaxAndSecondMax=highest+secondHighest;
       return sumOfMaxAndSecondMax;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(6);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int sumOfMaxAndSecondMax=0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > highest) {// if we find a new highest number
                secondHighest = highest;// then we need to shift the current highest number to be the second highest
                highest = nums.get(i);// new highest
            } else if (nums.get(i) > secondHighest) {
                secondHighest = nums.get(i);
            }
        }
        sumOfMaxAndSecondMax=highest+secondHighest;
        System.out.println(sumOfMaxAndSecondMax);




        System.out.println(findMaxSum(nums));

    }
}


