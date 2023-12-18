class Solution
{
    ArrayList<Integer> result;
	ArrayList <Integer> boundary(Node node)
	{
	  result = new ArrayList<>();

        if (node != null) {
            result.add(node.data);
            leftBoundary(node.left);
            leafNodes(node.left);
            leafNodes(node.right);
            rightBoundary(node.right);
        }

        return result;
    }

    void leftBoundary(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        result.add(node.data);

        if (node.left != null) {
            leftBoundary(node.left);
        } else {
            leftBoundary(node.right);
        }
    }

    void rightBoundary(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        if (node.right != null) {
            rightBoundary(node.right);
        } else {
            rightBoundary(node.left);
        }

        result.add(node.data);
    }

    void leafNodes(Node node) {
        if (node == null) {
            return;
        }

        leafNodes(node.left);

        if (node.left == null && node.right == null) {
            result.add(node.data);
        }

        leafNodes(node.right);
    }
}
