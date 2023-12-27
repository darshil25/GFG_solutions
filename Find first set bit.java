class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        int p = 1;
        if(n == 0){
            return 0;
        }
        while (n > 0) {
 
            if ((n & 1) > 0) {
                return p;
            }

            p++;
            n = n >> 1;
        }

        return -1;
            
    }
}
