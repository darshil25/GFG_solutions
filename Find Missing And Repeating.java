class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            else
                result[0] = Math.abs(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                result[1] = i + 1;
        }

        return result;
    }
}
