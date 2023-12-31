class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        if (s.length() < p.length()) {
            return "-1";
        }

        int[] hashP = new int[256];
        int[] hashS = new int[256];

        for (int i = 0; i < p.length(); i++) {
            hashP[p.charAt(i)]++;
        }

        int start = 0, startIndex = -1;
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        for (int j = 0; j < s.length(); j++) {
            hashS[s.charAt(j)]++;

            if (hashS[s.charAt(j)] <= hashP[s.charAt(j)]) {
                count++;
            }

            if (count == p.length()) {
                while (hashS[s.charAt(start)] > hashP[s.charAt(start)]
                        || hashP[s.charAt(start)] == 0) {
                    if (hashS[s.charAt(start)] > hashP[s.charAt(start)]) {
                        hashS[s.charAt(start)]--;
                    }
                    start++;
                }

                int windowLength = j - start + 1;
                if (minLength > windowLength) {
                    minLength = windowLength;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1) {
            return "-1";
        }

        return s.substring(startIndex, startIndex + minLength);
    }
}
