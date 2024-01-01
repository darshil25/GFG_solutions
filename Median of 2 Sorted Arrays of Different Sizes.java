class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < n) {
            merged[k++] = a[i++];
        }

        while (j < m) {
            merged[k++] = b[j++];
        }

        int totalLength = n + m;
        if (totalLength % 2 == 0) {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        } else {
            return merged[totalLength / 2];
        }
    }
}
