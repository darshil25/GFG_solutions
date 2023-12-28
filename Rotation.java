class Solution {
    int findKRotation(int arr[], int n) {
        int pivot = findPivot(arr, n); 
        return pivot + 1; 
    } 

    static int findPivot(int[] arr, int n) 
    { 
        int low = 0, high = n - 1; 
        while (low <= high) { 
            int mid = low + (high - low) / 2; 
            if (mid < high && arr[mid] > arr[mid + 1]) 
                return mid; 
            if (mid > low && arr[mid - 1] > arr[mid]) 
                return mid - 1; 
            if (arr[low] > arr[mid]) 
                high = mid - 1; 
            else
                low = mid + 1; 
        } 
        return -1; 
    } 
}
