class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = r-1;
        int left = 0; 
        int right = c-1;
        
        while(top <= bottom && left <= right) {
            
            //traverse top row
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            //traverse right column 
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]); 
            }
            right--;
            
            //traverse bottom row  
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; 
            }
            
           //traverse left column     
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; 
            }       
        }
        
        return result;
    }
}
