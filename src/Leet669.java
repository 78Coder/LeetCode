public class Leet669 {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val > high) {
            root.right = null;
            root.left = trimBST(root.left, low, high);
            return root.left;
        }
        if (root.val < low) {
            root.left = null;
            root.right = trimBST(root.right, low, high);
            return root.right;
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
