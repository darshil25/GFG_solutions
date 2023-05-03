class Solution {
    int MissingNumber(int array[], int n) {
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n-1; i++) {
            arrSum += array[i];
        }
        return sum - arrSum;
    }
    
}
