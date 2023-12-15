class Solution
{
    static int mod = 1000000007;
    public int nthPoint(int N)
    {
        int[] dp = new int[N + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[N];
    }
}
