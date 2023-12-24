class Solution {
    void pushZerosToEnd(int[] arr, int n) {
       int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
