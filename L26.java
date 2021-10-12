package Leetcode;

import java.util.Arrays;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int inf = Integer.MAX_VALUE;
        int crt = 0;
        int k = nums.length;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[crt]){
                nums[i] = inf;
                k --;
            }
            else{
                crt = i;
            }
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        return k;
    }
}
