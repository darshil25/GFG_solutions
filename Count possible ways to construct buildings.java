class Solution
{
    public int TotalWays(int N)
    {
        int MOD = 1000000007;

        long dp1 = 1, dp2 = 1;
        for (int i = 2; i <= N; i++) {

            long temp = (dp1 + dp2) % MOD;

            dp1 = dp2;
            
            dp2 = temp;
        }

        long waysOneSide = (dp1 + dp2) % MOD;

        long totalWays = (waysOneSide * waysOneSide) % MOD;

        return (int) totalWays;
    }
}
