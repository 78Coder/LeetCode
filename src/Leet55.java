public class Leet55 {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int cover = 1;
        for (int i = 0; i < cover; i++) {
            cover = Math.max(cover, i + nums[i]);
        }
        return cover == nums.length;
    }
}
