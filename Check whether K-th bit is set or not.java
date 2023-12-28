class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        if (((n >> k) & 1) > 0)
            return true;
        else
            return false;
    }
    
}
