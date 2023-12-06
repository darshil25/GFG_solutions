class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        if (n == 0)
            return false;
        if ((n & (~(n - 1))) == n)
            return true;
        return false;
        
    }
    
}
