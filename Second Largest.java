class Solution {
    int print2largest(int arr[], int arr_size) {
        int i, first, second; 

    if (arr_size < 2) 
    { 
        return -1; 
    } 
  
    int largest = second = Integer.MIN_VALUE; 
  
    for(i = 0; i < arr_size; i++) 
    { 
        largest = Math.max(largest, arr[i]); 
    } 

    for(i = 0; i < arr_size; i++) 
    { 
        if (arr[i] != largest) 
            second = Math.max(second, arr[i]); 
    } 
    if (second == Integer.MIN_VALUE) 
        return -1; 
    else
        return second; 
    }
}
