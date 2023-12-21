class Solution {
    int countTriplet(int arr[], int N) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = N - 1; i >= 0; i--) {
            int j = 0;
            int k = i - 1;

            while (j < k) {
                int sum = arr[j] + arr[k];

                if (sum == arr[i]) {
                    count++;
                    j++;
                    k--;
                } else if (sum < arr[i]) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return count;
    }
}
