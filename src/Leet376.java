public class Leet376 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int preDiff = 0;
        int curDiff = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];
            if ((curDiff < 0 && preDiff >= 0) || (curDiff > 0 && preDiff <= 0)) {
                preDiff = curDiff;
                count++;
            }
        }
        return count;
    }
}
