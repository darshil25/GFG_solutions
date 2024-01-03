class Res {
    int val;
}

class Solution
{
    int maxPathSumUtil(Node node, Res res) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return node.data;

        int ls = maxPathSumUtil(node.left, res);
        int rs = maxPathSumUtil(node.right, res);

        if (node.left != null && node.right != null) {
            res.val = Math.max(res.val, ls + rs + node.data);
            return Math.max(ls, rs) + node.data;
        }

        return (node.left == null) ? rs + node.data : ls + node.data;
    }

    int maxPathSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        int val = maxPathSumUtil(root, res);

        if (root.left != null && root.right != null)
            return res.val;
        else {
            return Math.max(res.val, val);
        }
    }
}
