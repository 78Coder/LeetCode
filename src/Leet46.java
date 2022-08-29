import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet46 {

    List<List<Integer>> ans = new ArrayList<>();

    LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        new Leet46().permute(new int[]{1,2,3});
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        build(nums, used);
        return ans;
    }

    public void build(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            build(nums, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
