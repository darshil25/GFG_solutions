class Solution {
    int findMaxSum(int arr[], int n) {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;
 
        for (i = 1; i < n; i++) {

            excl_new = Math.max(incl, excl);

            incl = excl + arr[i];
            excl = excl_new;
        }

        return Math.max(incl, excl);
    }
}
