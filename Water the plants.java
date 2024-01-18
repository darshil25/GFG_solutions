class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        int[] range = new int[n];

        for (int i = 0; i < n; ++i) {
            int l = Math.max(0, i - gallery[i]);
            int r = Math.min(n - 1, i + gallery[i]);
            for (int j = l; j <= r; ++j) {
                range[j] = Math.max(range[j], r);
            }
        }

        int count = 0, last = -1;

        for (int i = 0; i < n; ++i) {
            if (range[i] == 0) {
                return -1;
            }

            if (i > last) {
                ++count;
                last = range[i];
            }
        }
        return count;
    }
}
