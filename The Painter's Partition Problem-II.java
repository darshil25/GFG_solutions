class Solution{
    static boolean isPossible(int[] arr, int n, int k, long mid) {
        long sum = 0;
        int painters = 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If adding the current board exceeds the current mid time, allocate a new painter
            if (sum > mid) {
                painters++;
                sum = arr[i];

                // If the number of painters exceeds the given limit, it's not possible
                if (painters > k) {
                    return false;
                }
            }
        }

        return true;
    }

    static long minTime(int[] arr, int n, int k) {
        long low = 0, high = 0;

        // Initialize the low and high values for binary search
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        // Perform binary search to find the minimum time
        while (low < high) {
            long mid = (low + high) / 2;

            // If it's possible to paint all boards within mid time, search in the left half
            if (isPossible(arr, n, k, mid)) {
                high = mid;
            } else {
                // Otherwise, search in the right half
                low = mid + 1;
            }
        }

        return low;
    }
}
