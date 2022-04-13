package Leetcode;

// clarifications
// stair is empty? No
// stair is of size 1? Yes
// Multiple solutions? Yes
// Cost is integer? Yes
//
// Solution: dynamic programming
// [10, 15, 20, 10]
// define state: i
// recurrence relation: f(i) = Math.min(cost[i] + f(i-2), f(i-1) + cost[i])
// base case: f(0) = 0, f(1) = min(f(0), f(1))

class L746 {
    // bottom up
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length + 1;
        int[] dp = new int[n];

        // base case
        dp[0] = 0;
        if(n > 1) dp[1] = 0;

        // iteration
        for(int i = 2; i < n; i ++){
            dp[i] = Math.min(cost[i-2] + dp[i-2], cost[i-1] + dp[i-1]);
        }

        return dp[n - 1];
    }
}
