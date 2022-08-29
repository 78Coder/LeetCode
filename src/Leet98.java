public class Leet98 {

    boolean isValid = true;
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (!isValid) {
            return false;
        }
        if (root == null) {
            return true;
        }
        isValidBST(root.left);
        if (pre != null && pre.val >= root.val) {
            isValid = false;
            return false;
        }
        isValidBST(root.right);
        return isValid;
    }

}
