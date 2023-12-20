class Solution{
    static int findWinner(int n, int A[]){
        int res = 0;
         
        for (int i = 0; i < n; i++)
            res ^= A[i];

        if (res == 0 || n % 2 == 0)
            return 1;

        else
            return 2;
    
    }
}
