class Solution
{
    static Node head, tail;

    static void bintree2listUtil(Node root)
    {
        if (root == null)
            return;

        Node left = root.left;
        Node right = root.right;

        bintree2listUtil(root.left);

        if (head == null) {
            head = root;
        }

        root.left = tail;

        if (tail != null) {
            tail.right = root;
        }

        tail = root;

        bintree2listUtil(root.right);
    }

    Node bToDLL(Node root)
    {
        if (root == null)
            return null;

        head = null;
        tail = null;

        bintree2listUtil(root);

        return head;
    }
}
