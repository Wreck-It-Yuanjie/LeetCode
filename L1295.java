package Leetcode;

public class L1295 {
    public int findNumbers(int[] nums) {
        /*String*/
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            String temp = String.valueOf(nums[i]);
            if(temp.length()%2 == 0) result++;
        }
        return result;
    }
}
