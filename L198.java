package Leetcode;

// clarifications
// house number = 0? No
// house number = 1? Yes
// not circular? No
// cannot do adjacent houses
//
// Solution: dynamic programming
// define state: n[i]
// recurrence relation: f(i) = max(f(i-1), nums[i] + f(i-2))
// base case: f(0) = nums[0]; f(1) = max(nums[1], nums[0])

import java.util.*;

class L198 {
    // bottom up dp
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];

//         // base case
//         dp[0] = nums[0];
//         if(dp.length > 1) dp[1] = Math.max(nums[0], nums[1]);

//         // iteration
//         for(int i = 2; i < nums.length; i++){
//             dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
//         }

    //         return dp[dp.length - 1];
//     }
    // top down
    Map<Integer, Integer> cache = new HashMap<>();

    public int rob(int[] nums) {

        int n = nums.length - 1;

        return robHelper(nums, n);
    }

    private int robHelper(int[] nums, int n){
        // base case
        if(n == 0) return nums[0];
        if(n == 1) return Math.max(nums[0], nums[1]);

        // recursive case
        if(!cache.containsKey(n)){
            cache.put(n, Math.max(robHelper(nums, n - 1), robHelper(nums, n - 2) + nums[n]));
        }

        return cache.get(n);
    }
}
