class Solution{
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
 
        int max_len = 0;
        int sum = 0;
 
        for (int i = 0; i < n; i++) {
            sum += arr[i];
 
            int mod = ((sum % k) + k) % k;
 
            if (mod == 0)
                max_len = i + 1;
 
            if (!map.containsKey(mod))
                map.put(mod, i);
            else {
                int sz = i - map.get(mod);
                max_len = Math.max(max_len, sz);
            }
        }
 
        return max_len;
       
    }
 
}
