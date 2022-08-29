import java.util.Arrays;

public class Leet02 {

    public int maxConsecutive(int bottom, int top, int[] special) {
        int max = 0;
        Arrays.sort(special);
        max = Math.max(special[0] - bottom, max);
        max = Math.max(top - special[special.length - 1], max);
        for (int i = 1; i < special.length; i++) {
            max = Math.max(special[i] - special[i - 1] - 1, max);
        }
        return max;
    }
}
