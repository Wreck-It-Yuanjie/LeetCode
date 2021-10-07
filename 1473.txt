//refer to https://walkccc.me/LeetCode/problems/1473/
class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[target + 1][m][n + 1];

        final int j = minCost(houses, cost, m, n, target, 0, 0);
        return j == Maxk ? -1 : j;
    }

    public static final int Maxk = (int) 1e6 + 1;
    public int[][][] dp;

    public int minCost(int[] houses, int[][] cost, int m, int n, int k, int i, int pc) {
        if (i == m || k < 0)
            return k == 0 ? 0 : Maxk;
        if (dp[k][i][pc] > 0)
            return dp[k][i][pc];
        if (houses[i] > 0)
            return minCost(houses, cost, m, n, k - (pc == houses[i] ? 0 : 1), i + 1, houses[i]);

        int ans = Maxk;

        for (int c = 1; c <= n; ++c)
            ans = Math.min(ans,
                    cost[i][c - 1] + minCost(houses, cost, m, n, k - (pc == c ? 0 : 1), i + 1, c));

        return dp[k][i][pc] = ans;
    }
}