class Solution
{
        
    long power(int N,int R)
    {
        long ans = 1;
        long mod = 1000000007, pow = N * 1L;
        while (R > 0) {
 
            if (R % 2 == 1) {
                ans = (ans * pow) % mod;
            }
            pow = (pow * pow) % mod;

            R >>= 1;
        }
        return ans;
    }

}
