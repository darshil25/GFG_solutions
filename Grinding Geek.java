class Solution {
    public int max_courses(int n, int total, int[] cost) {
        int[][] dp = new int[n][total + 1];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, total, cost, dp);
    }

    private int solve(int i, int remainingTotal, int[] cost, int[][] dp) {
        if (i == cost.length) {
            return 0;
        }

        if (dp[i][remainingTotal] != -1) {
            return dp[i][remainingTotal];
        }

        int takeCourse = 0, skipCourse = 0;

        if (remainingTotal >= cost[i]) {
            int actualCost = cost[i] - (int) Math.floor(0.9 * cost[i]);
            takeCourse = 1 + solve(i + 1, remainingTotal - actualCost, cost, dp);
        }

        skipCourse = solve(i + 1, remainingTotal, cost, dp);

        return dp[i][remainingTotal] = Math.max(takeCourse, skipCourse);
    }
}
