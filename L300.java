package Leetcode;

import java.util.*;

// Step 1: clarification
// 1,2,3,3 not applicable
// 1,2,3,4,5,6 --> 1,2,3,5 yes
// 2,3,4,3,5,6,8,9 --> 7? yes
// 1,1,1,1,1,1 --> 1? yes
// n = 0? no
// n = 1? yes
//
// Step 2: brainstorm
//
// Solution 1: brute force
// time complexity: O(n2)
// space complexity: O(1)
//
// Solution 2:
// build a subarray: 2,3,4,3,5,6,8,9
// 1. initilize the subarray [2]
// 2. iterate the array. [2, 3, 4, 5, 6, 8, 9]
// 3. return the length of sub
//
// Solution 3: dp
// dp[]

class L300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int longest = 0;
        for (int c: dp) {
            longest = Math.max(longest, c);
        }

        return longest;
    }
}
