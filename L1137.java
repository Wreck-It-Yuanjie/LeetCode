package Leetcode;

// clarifications
// n < 0? no
// n = 0? yes
// n is integer?
// n is the label
//
// solution: dp
// define state i
// define recurrence relation: f(i) = f(i - 1) + f(i - 2) + f(i - 3)
// base case: f(0) = 0, f(1) = 1, f(2) = 1
// bottom up
// top down
// time complexity: n
// space complexity: n

class L1137 {
    // bottom up approach
    public int tribonacci(int n) {
        int[] dp = new int[n+1];

        // base case
        if(n >= 0) dp[0] = 0;
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 1;

        // iteration
        for(int i = 3; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}