import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class MyCalendar {

    TreeSet<int[]> set;

    public MyCalendar() {
        set = new TreeSet<>(Comparator.comparingInt(a -> a[0]));
        set = new TreeSet<>();
    }

    public boolean book(int start, int end) {
        for (int[] ints : set) {
            if (!(start >= ints[1] || end <= ints[0])) {
                return false;
            }
        }
        int[] ints = new int[]{start, end};
        set.add(ints);
        return true;
    }
}