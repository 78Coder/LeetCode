import java.util.HashSet;

public class CountIntervals {

    HashSet<Integer> set;

    public CountIntervals() {
        set = new HashSet<>();
    }

    public void add(int left, int right) {
        for (int i = left; i <= right; i++) {
            set.add(i);
        }
    }

    public int count() {
        return set.size();
    }
}
