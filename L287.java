package Leetcode;

import java.util.*;

class L287 {
    // hashset
//    public int findDuplicate(int[] nums) {
//        Set<Integer> hashset = new HashSet<>();
//
//        for(int i = 0; i < nums.length; i++){
//            if(!hashset.contains(nums[i])){
//                hashset.add(nums[i]);
//            }
//            else return nums[i];
//        }
//        return -1;
//    }
    // binary search
    public int findDuplicate(int[] nums) {
        // 'low' and 'high' represent the range of values of the target
        int low = 1, high = nums.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int cur = (low + high) / 2;

            // Count how many numbers in 'nums' are less than or equal to 'cur'
            int count = 0;
            for (int num : nums) {
                if (num <= cur)
                    count++;
            }

            if (count > cur) {
                duplicate = cur;
                high = cur - 1;
            } else {
                low = cur + 1;
            }
        }
        return duplicate;
    }
}
