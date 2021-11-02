package Leetcode;

import java.util.*;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // find it
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i - 1] != nums[i]){
                twosum(nums, i, result);
            }
        }
        return result;
    }

    void twosum(int[] nums, int i, List<List<Integer>> result){
        int low = i + 1; int high = nums.length -1;
        while (low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if(sum == 0){
                result.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while (low < high && nums[low] == nums[low - 1]){
                    low ++;
                }
            }
            else if(sum > 0){
                high --;
            }
            else{
                low ++;
            }
        }
    }
}
