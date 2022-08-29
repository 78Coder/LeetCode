import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Leet735 {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            }
            while (asteroids[i] < 0 && !stack.empty()) {
                Integer pop = stack.pop();
                if (-asteroids[i] == pop) {
                    break;
                }
                if (-asteroids[i] < pop) {
                    stack.push(pop);
                    break;
                }
                if (-asteroids[i] > pop) {
                    continue;
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[ans.length - 1 - i] = stack.pop();
        }
        return ans;
    }
}
