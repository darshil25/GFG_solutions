class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int n = str1.length();
        int m = str2.length();
  
        if (n != m)
            return false;
  
        int[] marked = new int[256];
        for (int i = 0; i < 256; i++)
            marked[i] = -1;
  
        int[] map = new int[256];
        for (int i = 0; i < 256; i++)
            map[i] = -1;
  
        for (int i = 0; i < n; i++)
        {
            if (map[str1.charAt(i)] == -1)
            {
                if (marked[str2.charAt(i)] != -1)
                    return false;
  
                marked[str2.charAt(i)] = 1;
                map[str1.charAt(i)] = str2.charAt(i);
            }
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }
  
        return true;
    }
}
