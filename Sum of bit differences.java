class Solution 
{
    long sumBitDifferences(int[] arr, int n) 
    {
        // code here
        long ans = 0;
        for (int i = 0; i < 32; i++) 
        {
            long count = 0;
            
            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count++;
                    
            ans += (count * (n - count) * 2);
        }
        return ans;
    }
}
