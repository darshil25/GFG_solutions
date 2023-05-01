class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int N = arr.length;
        int curS = arr[0];
        int maxS = arr[0];
        for(int i=1; i<N; i++){
            curS = Math.max(curS+arr[i], arr[i]);
            maxS = Math.max(curS, maxS);
        }
        return maxS;
        
    }
    
}

