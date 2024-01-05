class Solution
{
    static boolean SolveSudoku(int grid[][])
    {
        int N = grid.length;
        int row = -1, col = -1;
        boolean isEmpty = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    col = j;
                    
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        if (isEmpty) {
            return true;
        }

 
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {
        
                grid[row][col] = num;

                if (SolveSudoku(grid)) {
                    return true;
                }

                grid[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int grid[][], int row, int col, int num) {

        for (int x = 0; x < grid.length; x++) {
            if (grid[row][x] == num || grid[x][col] == num) {
                return false;
            }
        }

        int sqrtN = (int) Math.sqrt(grid.length);
        int subgridStartRow = row - row % sqrtN;
        int subgridStartCol = col - col % sqrtN;

        for (int i = 0; i < sqrtN; i++) {
            for (int j = 0; j < sqrtN; j++) {
                if (grid[i + subgridStartRow][j + subgridStartCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void printGrid(int grid[][])
    {
        int N = grid.length;
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(grid[r][d]);
                System.out.print(" ");
            }
            

            if ((r + 1) % (int) Math.sqrt(N) == 0) {
                System.out.print("");
            }
        }
    }
}
