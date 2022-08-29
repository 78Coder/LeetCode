import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet77 {

    List<List<Integer>> res = new ArrayList<>();

    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        comb(n, k, 1);
        return res;
    }

    public void comb(int n, int k, int start) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - (k - path.size()); i++) {
            path.add(i);
            comb(n, k, i + 1);
            path.removeLast();
        }
    }
}
