import java.util.ArrayList;
import java.util.HashMap;

public class s2 {

    public int minSumOfLengths (ArrayList<Integer> A, int T) {
        // write code here
        int left = 0;
        int right = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right < A.size()) {
            if (sum == T) {
                map.put(left, right - left + 1);
                continue;
            }
            if (sum < T) {
                sum += A.get(right);
                right++;
            }
            if (sum < T) {
                sum -= A.get(left);
                left++;
            }

        }
        return -1;
    }
}
