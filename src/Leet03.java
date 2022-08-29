public class Leet03 {

    public int largestCombination(int[] candidates) {
        int ans = 0;
        while (true) {
            int count = 0;
            boolean change = false;
            for (int i = 0; i < candidates.length; i++) {
                if (candidates[i] == 0) {
                    continue;
                }
                change = true;
                count += candidates[i] % 2;
                candidates[i] = candidates[i] >> 1;
            }
            ans = Math.max(count, ans);
            if (!change) {
                return ans;
            }
        }
    }
}
