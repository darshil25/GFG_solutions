class Solution
{
    // Function to find if there exists a triplet in the 
    // array A[] which sums up to X.
    public boolean find3Numbers(int A[], int arr_size, int sum) {
        quickSort(A, 0, arr_size - 1);

        for (int i = 0; i < arr_size - 2; i++) {
            int l = i + 1;
            int r = arr_size - 1;

            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    return true;
                } else if (A[i] + A[l] + A[r] < sum)
                    l++;
                else
                    r--;
            }
        }
        return false;
    }

    int partition(int A[], int si, int ei) {
        int x = A[ei];
        int i = (si - 1);

        for (int j = si; j <= ei - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[ei];
        A[ei] = temp;
        return (i + 1);
    }

    void quickSort(int A[], int si, int ei) {
        int pi;

        if (si < ei) {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
}
