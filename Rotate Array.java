
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        d = d % n; // Handle the case where d is greater than n
    reverseArray(arr, 0, n - 1);
    reverseArray(arr, 0, n - d - 1);
    reverseArray(arr, n - d, n - 1);
}

static void reverseArray(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
}
