class Solution {
    int transitionPoint(int arr[], int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid;
            } else if (arr[mid] == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
