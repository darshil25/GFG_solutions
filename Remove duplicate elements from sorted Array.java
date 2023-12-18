class Solution {
    int remove_duplicate(int arr[],int N){
        if (N == 0 || N == 1) {
            return N;
        }

        int distinctCount = 1; 
        int currentPos = 1;  

        for (int i = 1; i < N; i++) {
           
            if (arr[i] != arr[i - 1]) {
                
                arr[currentPos] = arr[i];
                
                currentPos++;
                distinctCount++;
            }
        }

        return distinctCount;
    }
}
