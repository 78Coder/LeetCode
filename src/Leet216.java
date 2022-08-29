import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet216 {

    List<List<Integer>> ans = new ArrayList<>();

    LinkedList<Integer> link = new LinkedList();

    int sum = 0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        comb(k, n, 1);
        return ans;
    }

    public void comb(int k, int n, int start) {
        if (sum > n) {
            return;
        }
        if (link.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(link));
            }
            return;
        }

        for (int i = start; i <= 9 - (k - link.size()) + 1; i++) {
            link.add(i);
            sum += i;
            comb(k, n, i + 1);
            link.removeLast();
            sum -= i;
        }
    }

    public static void main(String[] args) {

    }
}
