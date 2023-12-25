class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }

        return result;
    }
}
