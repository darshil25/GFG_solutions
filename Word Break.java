class Solution {
    public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
        // create a boolean array to store the results of subproblems
        boolean[] dp = new boolean[s.length() + 1];
        // base case: empty string can be segmented
        dp[0] = true;
        // loop through the string
        for (int i = 1; i <= s.length(); i++) {
            // loop through the dictionary
            for (String word : dictionary) {
                // check if the current substring ends with the word
                if (word.length() <= i && s.substring(i - word.length(), i).equals(word)) {
                    // if yes, update the dp array using the previous result
                    dp[i] = dp[i] || dp[i - word.length()];
                }
            }
        }
        // return the final result
        return dp[s.length()] ? 1 : 0;
    }
}
