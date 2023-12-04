class Solution{
    static String longestPalin(String s){
        int n = s.length();
        int start = 0, end = 1;
        int low, hi;

        for (int i = 0; i < n; i++) {
            low = i - 1;
            hi = i;
            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }
            low = i - 1;
            hi = i + 1;
            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }
        }
        return s.substring(start, start + end);
        
    }
}
