public class Leet235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int big;
        int small;
        if (p.val >= q.val) {
            big = p.val;
            small = q.val;
        } else {
            big = q.val;
            small = p.val;
        }
        if (root == null || (root.val >= small && root.val <= big)) {
            return root;
        }
        if (root.val < small) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p ,q);
        }
    }
}
