package ReplitHelp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Replit217 {

    /**
     * Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.
     * Input [12,12,13,45,78,7,7] output 2
     */

    static int countDuplicates(List<Integer> numbers){
        HashSet<Integer>set=new HashSet<>();// set for numbers from list to be stored
        HashSet<Integer> duplicates=new HashSet<>();//set for all duplicate numbers are stored

        for(int i=0;i<numbers.size();i++){
            if(set.contains(numbers.get(i))){// if our original set already contains that number then it is duplicate
                duplicates.add(numbers.get(i));// so we add it to our duplicates set
            }else{
                set.add(numbers.get(i));// if it is not in our original set, then we will add it to the set
            }
        }
        return duplicates.size();// we check our duplicate set to see how many duplicates we have
    }


    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(3);

        System.out.println(countDuplicates(nums));

    }
}
