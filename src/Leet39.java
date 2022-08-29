import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet39 {

    List<List<Integer>> ans = new ArrayList<>();

    LinkedList<Integer> link = new LinkedList();

    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        comb(candidates, target, 0);
        return ans;
    }

    public void comb(int[] candidates, int target, int start) {

        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(link));
            return;
        }
        if (link.size() > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            link.add(candidates[i]);
            sum += candidates[i];
            comb(candidates, target, i);
            link.removeLast();
            sum -= candidates[i];
        }
    }
}
