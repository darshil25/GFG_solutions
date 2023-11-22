class Solution{
    public void zigZag(int arr[], int n){
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= n - 2; i++) {
            if (flag)
            {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            else 
            {
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; 
        }
    }
    }
