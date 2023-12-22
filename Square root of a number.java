class Solution
{
    public boolean findPair(int arr[], int L, int N)
    {
        Arrays.sort(arr);

        int left = 0, right = 1;

        while (right < L) {
            int currentDiff = arr[right] - arr[left];

            if (currentDiff == N) {
                return true; 
            } else if (currentDiff > N) {
                left++; 
            } else {
                right++; 
            }
        }

        return false;
    }
}
