class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int l = 0;
        int r = n-1;
        int mid = 0;
       
        while (l <= r) {
            mid = (l + r) >> 1;
            if ((mid == 0
                 || arr[mid - 1] <= arr[mid])
                        && (mid == n - 1
                            || arr[mid + 1] <= arr[mid]))
                break;
            if (mid > 0 && arr[mid - 1] > arr[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
       
        return mid;
    }
}
