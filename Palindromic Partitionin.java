class Solution{
    static boolean generatePalindrome(String s,
                                      boolean[][] pal)
    {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            pal[i][i] = true;
        }

        for (int len = 2; len <= n; len++) {

            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)
                    && (len == 2 || pal[i + 1][j - 1])) {

                    pal[i][j] = true;
                }
            }
        }

        return true;
    }
    static int palindromicPartition(String s)
    {
        if (s.isEmpty())
            return 0;
        int n = s.length();

        boolean[][] pal = new boolean[n][n];

        generatePalindrome(s, pal);

        int[] minCutDp = new int[n];
        Arrays.fill(minCutDp, Integer.MAX_VALUE);

        minCutDp[0] = 0;

        for (int i = 1; i < n; i++) {

            if (pal[0][i]) {
                minCutDp[i] = 0;
            }
            else {
                for (int j = i; j >= 1; j--) {

                    if (pal[j][i]) {

                        if (minCutDp[j - 1] + 1
                            < minCutDp[i])
                            minCutDp[i]
                                = minCutDp[j - 1] + 1;
                    }
                }
            }
        }

        return minCutDp[n - 1];
    }
}
