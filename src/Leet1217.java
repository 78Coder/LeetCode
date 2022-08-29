public class Leet1217 {

    public int minCostToMoveChips(int[] position) {
        int sum0 = 0;
        int sum1 = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                sum0++;
            } else {
                sum1++;
            }
        }
        return Math.min(sum0, sum1);
    }
}
