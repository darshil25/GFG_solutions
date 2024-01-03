class Solution {
    public int smallestSubstring(String S) {
        int n = S.length();
        int[] count = new int[3];
        int left = 0; 
        int minLength = Integer.MAX_VALUE; 
        for (int right = 0; right < n; right++) {
            char currentChar = S.charAt(right);
            count[currentChar - '0']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                minLength = Math.min(minLength, right - left + 1);
                char leftChar = S.charAt(left);
                count[leftChar - '0']--;
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
};
