class Solution
{
	
	void selectionSort(int arr[], int n)
	{
	    n = arr.length;
	    for(int i=0; i<n-1; i++){
	        int min = i;
	        for(int j=i+1; j<n; j++){
	            if(arr[min] > arr[j]){
	                min = j;
	            }
	        }
	        int temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	    }
	}
}
