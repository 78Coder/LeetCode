public class Leet977 {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                ans[i] = nums[left] * nums[left];
                left++;
            }else {
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}
