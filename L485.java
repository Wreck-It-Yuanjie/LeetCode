package Leetcode;

public class L485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*one pass*/
        int result = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 && nums[i] == 1) temp = 1;
            else{
                if(nums[i] == 1) temp++;
                else if(temp > result) {
                    result = temp;
                    temp = 0;

                }
                else temp = 0;
            }
        }
        if(result < temp) result = temp;
        return result;
    }
}
