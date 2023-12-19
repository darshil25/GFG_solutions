class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Node temp = stack1.pop();
                result.add(temp.data);

                if (temp.right != null) {
                    stack2.push(temp.right);
                }
                if (temp.left != null) {
                    stack2.push(temp.left);
                }
            }

            while (!stack2.isEmpty()) {
                Node temp = stack2.pop();
                result.add(temp.data);

                if (temp.left != null) {
                    stack1.push(temp.left);
                }
                if (temp.right != null) {
                    stack1.push(temp.right);
                }
            }
        }

        return result;
    }
}
