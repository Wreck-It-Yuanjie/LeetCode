package Leetcode;

// clarifications
// nums is empty? No
// nums size is 1? Yes
// Integer? Yes
// [2,3,4,4] all repeated ones are deleted
//
// solution dynamic programming

// hashmap calculate the value of each number
// define state: the current number we are at
// recurrence relation: value(i) + dp(i-2), dp(i-1)
// base case: f(0) = nums[0], f(1) = max(nums[0], nums[1]);
// time complexity: O(N + k)
// space complexity: O(N + k)

import java.util.*;

class L740 {
    // bottom up
    public int deleteAndEarn(int[] nums) {
        int n = 0;

        Map<Integer, Integer> countMap = new TreeMap<>();

        // build the tree map
        for(int i = 0; i < nums.length; i++){
            if(!countMap.containsKey(nums[i])){
                countMap.put(nums[i], 0);
            }
            n = Math.max(n, nums[i]);
            countMap.put(nums[i], countMap.get(nums[i]) + nums[i]);
        }

        // iterate the tree map
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = countMap.getOrDefault(1,0);

        for(int j = 2; j < dp.length; j++){
            dp[j] = Math.max(dp[j-1], countMap.getOrDefault(j, 0) + dp[j-2]);
        }

        return dp[n];
    }
}
