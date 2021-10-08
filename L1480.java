package Leetcode;

class L1480 {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            sums[i] = sum;
        }
        return sums;
    }
}