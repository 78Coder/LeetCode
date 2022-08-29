import java.util.ArrayList;
import java.util.List;

public class Leet257 {
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return ans;
        }
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return ans;
    }

    public void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        sb.append("->" + root.val);
        if (root.left == null && root.right == null) {
            ans.add(sb.substring(2, sb.length()));
        }
        if (root.left != null) {
            buildString(root.left, sb);
            int size = ("" + root.left.val).length();
            sb.delete(sb.length() - 2 - size, sb.length());
        }
        if (root.right != null) {
            buildString(root.right, sb);
            int size = ("" + root.left.val).length();
            sb.delete(sb.length() - 2 - size, sb.length());
        }
    }
}
