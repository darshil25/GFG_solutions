class Solution
{
	boolean isIdentical(Node root1, Node root2)
	{
	    if (root1 == null && root2 == null)
        return true;

    else if (root1 != null && 
             root2 == null)
        return false;
    else if (root1 == null && 
             root2 != null)
        return false;
    else
    { 
        if (root1.data == root2.data && 
            isIdentical(root1.left, root2.left) == true && 
            isIdentical(root1.right, root2.right) == true)
            return true;
        else
            return false;
    }
	}
	
}
