class Solution{
    static boolean isvalid(int x,int y,int n,int m)
    {
        if(x<0||y<0||x>=n||y>=m) return false;
        return true;
    }
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
         int[] dx1={-1,-1,-1,0,0,1,1,1};
        int[] dy1={-1,0,1,-1,1,-1,0,1};
        int[] dx2={-2,-2,-2,-2,-2,-1,0,1,2,2,2,2,2,1,0,-1};
        int[] dy2={-2,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2};
        List<Integer> answer=new ArrayList<Integer>();
        for(int k=0;k<queries.length;k++)
        {
            int type=queries[k][0];
            int x=queries[k][1];
            int y=queries[k][2];
            int ans=0;
            if(type==1)
            {
                for(int i=0;i<dx1.length;i++)
                {
                    int x1=x+dx1[i];
                    int y1=y+dy1[i];
                    if(isvalid(x1,y1,n,m))
                    {
                        ans+=mat[x1][y1];
                    }
                }
            }
            if(type==2)
            {
                for(int i=0;i<dx2.length;i++)
                {
                    int x1=x+dx2[i];
                    int y1=y+dy2[i];
                    if(isvalid(x1,y1,n,m))
                    {
                        ans+=mat[x1][y1];
                    }
                }
            }
            answer.add(ans);
        }
        return answer;
    }
}
