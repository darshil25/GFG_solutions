class Solution
{

    static int determinantOfMatrix(int matrix[][], int n)
    {
       if (n == 1) {
        return matrix[0][0];
    } else if (n == 2) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Recursive case:
    int det = 0;
    for (int i = 0; i < n; i++) {
        det += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * determinantOfMatrix(getMinor(matrix, 0, i, n), n - 1);
    }

    return det;
}


static int[][] getMinor(int matrix[][], int row, int col, int n) {
    int[][] minor = new int[n - 1][n - 1];
    int k = 0;
    for (int i = 0; i < n; i++) {
        if (i == row) {
            continue;
        }
        int j = 0;
        for (int m = 0; m < n; m++) {
            if (m == col) {
                continue;
            }
            minor[k][j++] = matrix[i][m];
        }
        k++;
    }
    return minor;
}
}
