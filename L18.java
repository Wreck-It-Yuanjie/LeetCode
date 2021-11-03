package Leetcode;

import java.util.*;

public class L18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        //call the ksum function and find the sum
        for(int p1 = 0; p1 < nums.length - 3; p1++){
            for(int p2 = p1 + 1; p2 < nums.length - 2; p2++){
                int p3 = p2 + 1;
                int p4 = nums.length - 1;
                while(p3 < p4){
                    int sum = nums[p1] + nums[p2] + nums[p3] + nums[p4];
                    if(sum == target){
                        result.add(Arrays.asList(nums[p1], nums[p2], nums[p3++], nums[p4--]));
                    }
                    else if(sum > target){
                        p4--;
                    }
                    else{
                        p3++;
                    }
                }
            }
        }
        return new ArrayList<> (result);
    }

}
