package Leetcode;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] conNums = new int[2*nums.length];
        // System.out.println(conNums);
        for (int i = 0; i < conNums.length; i++){
            int iNums = i%nums.length;
            conNums[i] = nums[iNums];
        }
        return conNums;
    }
}
