class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        return checkString(s, k) ? 1 : 0;
    }
        
    static boolean checkString(String str, int k) {

        int n = str.length();
        if (n % k != 0)
            return false;

        HashMap<String, Integer> mp = new HashMap<>();
        try {
            for (int i = 0; i < n; i += k)
                mp.put(str.substring(i, i + k), mp.get(str.substring(i, i + k)) == null ? 1
                        : mp.get(str.substring(i, i + k)) + 1);
        } catch (Exception e) {
        }

        if (mp.size() == 1)
            return true;

        if (mp.size() != 2)
            return false;

        HashMap.Entry<String, Integer> entry = mp.entrySet().iterator().next();

        if (entry.getValue() == (n / k - 1) || entry.getValue() == 1)
            return true;

        return false;
    }
}
