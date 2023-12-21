class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] result = new long[n];

    long leftProduct = 1;
    for (int i = 0; i < n; i++) {
        result[i] = leftProduct;
        leftProduct *= nums[i];
    }

    long rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        result[i] *= rightProduct;
        rightProduct *= nums[i];
    }

    return result;
	} 
} 
