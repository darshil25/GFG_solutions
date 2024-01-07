class Solution {
    static int splitArray(int[] arr , int N, int K) {
       int start = 1;
        int end = 0;

        for (int i = 0; i < N; ++i) {
            if (arr[i] > start)
                start = arr[i]; 
            end += arr[i]; 
        }

        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            boolean canSplit = check(mid, arr, N, K);

            if (canSplit) {
                answer = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        return answer;
    }

    static boolean check(int mid, int array[], int n, int K) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > mid)
                return false;

            sum += array[i];

            if (sum > mid) {
                count++;
                sum = array[i];
            }
        }
        count++;

        return count <= K;
    }
};
