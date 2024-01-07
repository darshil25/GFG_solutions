
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = arr[0];
        int l = 0;
        int r = 1;
        for(r = 1;r<=n;r++)
        {
            
            while(sum > s && l<r-1)
            {
                sum = sum - arr[l];
                l++;
            }
            if(sum == s)
            {
                list.add(l+1);
                list.add(r);
                return list;
                
            }
            if(r < n)
            {
                sum = sum + arr[r];
            }
            
        }
        list.add(-1);
        return list;
    }
}
