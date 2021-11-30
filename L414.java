package Leetcode;

import java.util.*;

public class L414 {
    public int thirdMax(int[] nums) {
        /*two pointers*/
        int result = 0;
        int pointer = nums.length - 1;
        HashSet<Integer> sumnums = new HashSet<>();

        //sort the array
        Arrays.sort(nums);

        //one pass
        while(pointer >= 0){
            int sumsize = sumnums.size();
            if (sumnums.contains(nums[pointer]) == false){
                sumnums.add(nums[pointer]);
            }

            if(sumnums.size() == 3) return nums[pointer];
            else pointer--;
        }

        return nums[nums.length - 1];
    }
}
