class Solution{
    String longestCommonPrefix(String arr[], int n){
        if (n == 0) {
            return "-1";
        }

        // Find the minimum length string in the array
        int minLength = Integer.MAX_VALUE;
        for (String str : arr) {
            minLength = Math.min(minLength, str.length());
        }

        // Iterate through characters at each position
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char currentChar = arr[0].charAt(i);

            // Check if the current character is common at this position in all strings
            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != currentChar) {
                    return result.length() > 0 ? result.toString() : "-1";
                }
            }

            // If the current character is common, append it to the result
            result.append(currentChar);
        }

        return result.length() > 0 ? result.toString() : "-1";
    }
}
