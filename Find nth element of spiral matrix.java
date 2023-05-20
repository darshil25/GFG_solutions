class GfG {
    public int findK(int[][] matrix, int n, int m, int k) {
        int srow = 0;
        int scol = 0;
        int erow = n - 1;
        int ecol = m - 1;
        int p = k - 1;

        while (srow <= erow && scol <= ecol) {
            // Traverse top row
            for (int j = scol; j <= ecol; j++) {
                if (p-- == 0) {
                    return matrix[srow][j];
                }
            }
            srow++;

            // Traverse right column
            for (int i = srow; i <= erow; i++) {
                if (p-- == 0) {
                    return matrix[i][ecol];
                }
            }
            ecol--;

            if (srow <= erow) {
                // Traverse bottom row
                for (int j = ecol; j >= scol; j--) {
                    if (p-- == 0) {
                        return matrix[erow][j];
                    }
                }
                erow--;
            }

            if (scol <= ecol) {
                // Traverse left column
                for (int i = erow; i >= srow; i--) {
                    if (p-- == 0) {
                        return matrix[i][scol];
                    }
                }
                scol++;
            }
        }

        return -1; // Invalid k value or empty matrix
    }
}
