class Solution
{
void getLSP(String pat, int[] lsp) {
        int sz = 0, i = 1;
        lsp[0] = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(sz)) {
                lsp[i++] = ++sz;
            } else if (sz == 0) {
                lsp[i++] = 0;
            } else {
                sz = lsp[sz - 1];
            }
        }
    }

    ArrayList<Integer> search(String pat, String txt) {
        int n = pat.length(), m = txt.length();
        int[] ls = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        getLSP(pat, ls);

        int i = 0, j = 0;
        while (i < m) {
            if (txt.charAt(i) == pat.charAt(j)) {
                ++i;
                ++j;
            }
            if (j == n) {
                ans.add(i - j + 1);
                j = ls[j - 1];
            } else if (i < m && txt.charAt(i) != pat.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = ls[j - 1];
                }
            }
        }
        return ans;
    }
}
