class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
        int[][][]dp=new int[n+1][2][3];
        
        for(int ind=n-1;ind>=0;ind--){
           for(int buy=0;buy<=1;buy++){
              for(int cap=1;cap<=2;cap++){
                  int profit=0;
                    if(buy==0)  profit=Math.max(dp[ind+1][0][cap],-price[ind]+dp[ind+1][1][cap]);

                    if(buy==1)  profit=Math.max(price[ind]+dp[ind+1][0][cap-1],dp[ind+1][1][cap]);
                    
                    dp[ind][buy][cap]=profit;



                }
            }
        }
        
        return dp[0][0][2];

    }
}
