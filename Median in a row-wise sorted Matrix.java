class Solution {
    int median(int matrix[][], int R, int C) {
        int[] sortedArray = new int[R * C];
        int index = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sortedArray[index++] = matrix[i][j];
            }
        }

        Arrays.sort(sortedArray);

        return sortedArray[(R * C - 1) / 2];       
    }
}
