class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] Arr, int N) {
          long maxProduct = Arr[0];
        long minProduct = Arr[0];
        long result = Arr[0];

        for (int i = 1; i < N; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (Arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct for the current index
            maxProduct = Math.max(Arr[i], maxProduct * Arr[i]);
            minProduct = Math.min(Arr[i], minProduct * Arr[i]);

            // Update the overall result
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
