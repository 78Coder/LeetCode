import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leet40 {

    List<List<Integer>> ans = new ArrayList<>();

    LinkedList<Integer> path = new LinkedList<>();

    boolean[] used;
    
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        used = new boolean[candidates.length];
        comb(candidates, target, 0);
        return ans;
    }

    public void comb(int[] candidates, int target, int start) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length && sum + candidates[i] < target; i++) {
            if (i > 0 && candidates[i - 1] == candidates[i] && !used[i - 1]) {
                continue;
            }
            sum += candidates[i];
            used[i] = true;
            path.add(candidates[i]);
            comb(candidates, target, i + 1);
            used[i] = false;
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
