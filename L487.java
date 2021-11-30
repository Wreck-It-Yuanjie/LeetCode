package Leetcode;

public class L487 {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*two pointers*/
        int result = 0;
        int numzeros = 0;
        int low = 0;
        int high = 0;

        //first pass
        while(high < nums.length){

            //if 0, numzeros+1
            if(nums[high] == 0) {
                numzeros++;
            }

            //if number of 0s > 1, restart
            while(numzeros == 2) {
                if(nums[low] == 0) {
                    numzeros--;
                }
                low++;
            }

            //update the result
            result = Math.max(result, high - low + 1);

            //expand the window
            high++;
        }
        return result;
    }
}
