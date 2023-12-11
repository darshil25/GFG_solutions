class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long maxSum = 0, currSum = 0;
    
    for(int i=0; i<K; i++){
        currSum += Arr.get(i); 
    }
    
    maxSum = currSum;
    
    for(int i=K; i<N; i++){
        currSum += Arr.get(i) - Arr.get(i-K);
        maxSum = Math.max(maxSum, currSum); 
    }
    
    return maxSum;
    }
}
