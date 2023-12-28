int m = wild.length();
        int n = pattern.length();

        // Initialize the DP array
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty pattern matches empty wild
        dp[0][0] = true;

        // Fill in the DP array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters are the same or wild has '?'
                if (wild.charAt(i - 1) == pattern.charAt(j - 1) || wild.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If wild has '*'
                else if (wild.charAt(i - 1) == '*') {
                    // '*' can match either an empty string or any sequence of characters
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
