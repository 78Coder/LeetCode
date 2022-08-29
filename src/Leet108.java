public class Leet108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length);
    }

    public TreeNode build(int[] nums, int start, int end) {
        if (end - start <= 0) {
            return null;
        }
        if (end - start == 1) {
            return new TreeNode(nums[start]);
        }
        TreeNode root = new TreeNode(nums[start + (end - start) / 2]);
        root.left = build(nums, start, start + (end - start) / 2);
        root.right = build(nums, start + (end - start) / 2 + 1, end);
        return root;
    }
}
