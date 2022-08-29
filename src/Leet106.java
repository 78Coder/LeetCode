public class Leet106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode build(int[] inorder, int inLeft, int inRight,
                          int[] postorder, int postLeft, int postRight) {
        if (inRight - inLeft < 1) {
            return null;
        }
        if (inRight - inLeft == 1) {
            return new TreeNode(inorder[inLeft]);
        }
        int rootVal = postorder[postRight - 1];
        TreeNode root = new TreeNode(rootVal);
        int index = 0;
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        root.left = build(inorder, inLeft, index, postorder, postLeft, postLeft + (index - inLeft));
        root.right = build(inorder, index + 1, inRight, postorder, postLeft + (index - inLeft), postRight - 1);
        return root;
    }
}
