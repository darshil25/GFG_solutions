class Solution {
    public int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[] curr = new int[n + 1];

        for (int j = 0; j <= n; j++) {
            curr[j] = j;
        }
 
        int previous;
        for (int i = 1; i <= m; i++) {

            previous = curr[0];
            curr[0] = i;
 
            for (int j = 1; j <= n; j++) {

                int temp = curr[j];

                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    curr[j] = previous;
                } else {
                    curr[j] = 1 + Math.min(Math.min(previous, curr[j - 1]), curr[j]);
                }
                previous = temp;
            }
        }
        return curr[n];
    }
}
