class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int[] freq = new int[max + 1];
        Arrays.fill(freq, 0);
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        
        int count = 0;
        for (int i = 0; i <= max; i++) {
            if (freq[i] != 0) {
                count += freq[i];
                if (count >= k) {
                    return i;
                }
            }
        }
        return -1;
    } 
}
