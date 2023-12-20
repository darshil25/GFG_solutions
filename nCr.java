class Solution{
    static final int MOD = 1000000007;

    static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }

        int[][] dp = new int[r + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[j][i] = 1;
                } else {
                    dp[j][i] = (dp[j - 1][i - 1] + dp[j][i - 1]) % MOD;
                }
            }
        }

        return dp[r][n];
    }
