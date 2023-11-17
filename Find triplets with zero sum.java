class Solution
{
	public boolean findTriplets(int arr[] , int n)
    {
        boolean found = false;

        Arrays.sort(arr);
 
        for (int i = 0; i < n - 1; i++) {

            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
 
                    l++;
                    r--;
                    found = true;
                }

                else if (x + arr[l] + arr[r] < 0)
                    l++;

                else
                    r--;
            }
        }
    return found;
}
}
