class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans = new ArrayList<>();
 
        if (root == null) {
            return ans;
        }
 
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean ok = true;
 
        while (!q.isEmpty()) {
            Node it = q.poll();
            if (it == null) {
                if (ok == false) {
                    ok = true;
                }
 
                if (q.size() == 0)
                    break;
 
                else {
                    q.add(null);
                }
            }
            else {
 
                if (ok) {
                    ans.add(it.data);
                    ok = false;
                }
 
                if (it.left != null) {
                    q.add(it.left);
                }
 
                if (it.right != null) {
                    q.add(it.right);
                }
            }
        }
 
        return ans;
    }
}
