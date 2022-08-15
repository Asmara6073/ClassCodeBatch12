package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AddMaxAndSecondMax {
    /**
     *Write the logic that picks largest and second largest numbers from a list add them and return the results.
     * input to method is a list that contains the numbers input [10,20,30,40]
     * output [70]
     */


    public static  int addMaxAndSecondMax(List<Integer> nums){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>max){
                secondMax=max;
                max=nums.get(i);
            }else if(nums.get(i)>secondMax){
                secondMax=nums.get(i);
            }
        }

        sum=max+secondMax;

        return sum;
    }


    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(45);
        nums.add(2);
        nums.add(40);
        System.out.println(addMaxAndSecondMax(nums));




    }

}
