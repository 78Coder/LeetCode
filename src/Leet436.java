public class Leet436 {

    public int[] findRightInterval(int[][] intervals) {
        int[] pos = new int[2000002];
        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            pos[intervals[i][0] + 1000001] = i + 1;
        }
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][1] - 1000001; j < 1000000; j++) {
                if (pos[j + 1000001] >= 1) {
                    ans[i] = pos[j + 1000001] - 1;
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
}
