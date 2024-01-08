class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[]) {
        int lis[] = new int[n];
        int len = 1; 

        lis[0] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > lis[len - 1]) {
                lis[len] = arr[i];
                len++;
            } else {
                int idx = binarySearch(lis, 0, len - 1, arr[i]);
                lis[idx] = arr[i];
            }
        }

        return len;
    }

    static int binarySearch(int lis[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (lis[mid] == key)
                return mid;
            else if (lis[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
} 
