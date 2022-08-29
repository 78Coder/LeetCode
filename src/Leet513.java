public class Leet513 {

    int depth = 0;
    int maxDepth = 0;
    int left;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth++;
        if (depth > maxDepth) {
            maxDepth = depth;
            left = root.val;
        }
        findBottomLeftValue(root.left);
        findBottomLeftValue(root.right);
        depth--;
        return left;
    }

}
