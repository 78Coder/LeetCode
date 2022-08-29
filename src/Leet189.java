public class Leet189 {

    public void rotate(int[] nums, int k) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
        nums = ans;
    }

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        new Leet189().rotate(ints, 3);
    }
}

