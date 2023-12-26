class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        int l = getHeight(node);
      ArrayList<Integer> ans = new ArrayList<>();
      
      if(l == 0) {
          return ans;
      }
      ans.add(node.data);
      for(int i=1; i<l; i++) {
          ans.add(0);
      }
      
      Queue<Node> q = new LinkedList<Node>();
      q.add(node);
      
      int idx = 0;
      while(!q.isEmpty()) {
          int size = q.size();
          
          while(size > 0) {
              Node n = q.poll();
              ans.set(idx, n.data);
              if(n.left != null) {
                  q.add(n.left);
              }
              
              if(n.right != null) {
                  q.add(n.right);
              }
              
              size--;
          }
          idx++;
      }
      return ans;
    }
    
    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        return Math.max(left, right) + 1;
    }
}
