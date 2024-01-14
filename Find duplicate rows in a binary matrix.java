class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       HashSet<String> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            StringBuilder rowString = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowString.append(matrix[i][j]);
            }

            if (set.contains(rowString.toString())) {
                result.add(i);
            } else {
                set.add(rowString.toString());
            }
        }

        return result;
    }
}
