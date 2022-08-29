public class Leet209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum +=nums[right];
            while (sum >= target) {
                length = Math.min(length, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
