package Leetcode;

import java.util.*;

public class L896 {
    public boolean isMonotonic(int[] nums) {
        /*divide and conquer*/

        /*one pass*/

        /*sort and compare*/
        int[] sortArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++) sortArray[i] = nums[i];
        Arrays.sort(sortArray);

        boolean flag1 = isSameIn(nums, sortArray);
        boolean flag2 = isSameOpp(nums, sortArray);

        if(flag1 == true|| flag2 == true) return true;
        else return false;

    }

    public boolean isSameIn(int[] nums, int[] sortArray){
        for(int i = 0; i < nums.length; i++){
            if (sortArray[i] - nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isSameOpp(int[] nums, int[] sortArray){
        for(int i = 0; i < nums.length; i++){
            if (sortArray[i] - nums[nums.length - 1 - i] != 0) {
                return false;
            }
        }
        return true;
    }
}
