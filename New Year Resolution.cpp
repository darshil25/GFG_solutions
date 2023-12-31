class Solution {
    
    bool solve(int coin[] , int n , int i , int sum , vector<vector<int>>&dp){
         if(i>=n){
             if( (sum>=24 && sum%24==0) or (sum>=20 && sum%20==0 ))return 1;
             else if (sum==2024)return sum;
             else return 0;
         } 
         if(dp[i][sum]!=-1)return dp[i][sum];
         
         return dp[i][sum] =  solve(coin , n ,i+1 , sum , dp ) or solve(coin , n ,i+1 , sum+coin[i] , dp);
     }

    public:
    int isPossible(int N , int coins[]) 
    {   
        vector<vector<int>>dp(N  , vector<int>(2025 , -1));
        return solve(coins , N, 0 ,0 , dp);
       
    }
    
};
