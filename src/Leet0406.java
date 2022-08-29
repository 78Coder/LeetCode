public class Leet0406 {


    private TreeNode res = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        while (root != null) {
            if (root.val <= p.val) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}
