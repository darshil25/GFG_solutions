class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    static int  isEqual = 1;
    
    public static void helper(Node root){
        if(isEqual==0){
            return ;
        }
        if(root==null){
            return ;
        }
        if(root.left==null && root.right ==null){
            return ;
        }
        int temp = 0;
        if(root.left!=null){
            temp += root.left.data;
        }
        if(root.right!=null){
            temp += root.right.data;
        }
        if(root.data!=temp){
            isEqual = 0;
            return ;
        }
        helper(root.left);
        helper(root.right);
    }
    public static int isSumProperty(Node root)
    {
        // add your code here
        
        helper(root);
        int ans = isEqual;
        isEqual = 1;
        return ans;
    }
}
