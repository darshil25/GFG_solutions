class Solution {
    int binarysearch(int arr[], int n, int k) {
        for(int i=0; i<n; i++){
            if(k==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
