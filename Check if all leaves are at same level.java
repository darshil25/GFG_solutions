class Leaf 
{
    int leaflevel=0;
}

class Solution
{
    Leaf mylevel = new Leaf();
    
    boolean check(Node root)
    {
	    // Your code here
	    int level = 0;
        return checkUtil(root, level, mylevel);
    }
    
    boolean checkUtil(Node node, int level, Leaf leafLevel) 
    {
        // Base case
        if (node == null)
            return true;
            
        if (node.left == null && node.right == null) 
        {
            if (leafLevel.leaflevel == 0) 
            {
                leafLevel.leaflevel = level; 
                return true;
            }
    
            return (level == leafLevel.leaflevel);
        }
        
        return checkUtil(node.left, level + 1, leafLevel) 
                    && checkUtil(node.right, level + 1, leafLevel);
    }
}
