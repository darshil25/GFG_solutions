class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxCount = 0;
        int maxRowIndex = -1;
        
        int i, j;
    
        for(i = 0; i < n; i++){
            int count = 0;
            for(j = 0; j < m; j++){
                if(arr[i][j] == 1)
                  count++;
            }
            
            if(count > maxCount){
                maxCount = count;
                maxRowIndex = i; 
            }
        }
        
        return maxRowIndex;
    }
}
