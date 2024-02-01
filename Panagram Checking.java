class Solution
{

    public static boolean checkPangram(String s) {

        boolean[] present = new boolean[26];

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {

                present[Character.toLowerCase(c) - 'a'] = true;
            }
        }

        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
