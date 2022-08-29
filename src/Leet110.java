public class Leet110 {

    boolean balance = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return balance;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1) {
            balance = false;
        }
        return Math.max(left, right) + 1;
    }
}
