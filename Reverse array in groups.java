class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
        int left = i;
        
        // to handle case when k is not multiple
        // of n
        int right = Math.min(i + k - 1, n - 1);
        
        // reverse the sub-list [left, right]
        while (left < right) {
            Collections.swap(arr, left, right);
            left += 1;
            right -= 1;
        }
    }
    }
}
