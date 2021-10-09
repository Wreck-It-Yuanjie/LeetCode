package Leetcode;

import java.util.Arrays;

class L1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] numsf = new int[2*n];
        for(int i = 0; i < n*2; i++){
            if(i < n){
                numsf[i*2] = nums[i];
            }
            else{
                numsf[(i - n + 1)*2-1] = nums[i];
            }
        }
        return numsf;
    }
}