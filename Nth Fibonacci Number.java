class Solution {
    static int nthFibonacci(int n){
          int mod = 1000000007;

        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % mod;
            a = b;
            b = temp;
        }

        return b;
    }
}
