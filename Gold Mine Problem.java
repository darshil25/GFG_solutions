class Solution {
    static int[] dx = {-1, 0, 1}; // Possible x-direction movements
    static int[] dy = {-1, -1, -1}; // Corresponding y-direction movements

    static boolean isValid(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static int maxGold(int n, int m, int M[][]) {
        int[][] dp = new int[n][m];

        // initialization of first col
        for (int i = 0; i < n; i++)
            dp[i][0] = M[i][0];

        // Dynamic programming
        for (int j = 1; j < m; j++) {
            for (int i = 0; i < n; i++) {
                int mx = Integer.MIN_VALUE;
                for (int k = 0; k < 3; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];

                    if (isValid(x, y, n, m))
                        mx = Math.max(mx, dp[x][y] + M[i][j]);
                }
                dp[i][j] = mx;
            }
        }

        int ans = Integer.MIN_VALUE;

        // find max value from the last column of the dp table
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i][m - 1]);
        }
        return ans;
    }
}
