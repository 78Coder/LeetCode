import java.util.Arrays;
import java.util.Collection;

public class Solution02 {

    public int findGreaterNum (int N) {
        String s = "" + N;
        char[] chars = s.toCharArray();
        int i = chars.length - 1;
        boolean ans = false;
        while (i > 0) {
            if (chars[i] - chars[i - 1] > 0) {
                int j = chars.length;
                while (j >= 0) {
                    if (chars[j] == chars[i]) {
                        break;
                    }
                    j--;
                }
                char tmp = chars[j];
                chars[j] = chars[i - 1];
                chars[i - 1] = tmp;
                ans = true;
                i = j;
                break;
            }
            i--;
        }
        if (!ans) {
            return -1;
        }
        Arrays.sort(chars, i, chars.length);
        int aaa = -1;
        try {
            aaa = Integer.parseInt(String.copyValueOf(chars));
        } catch (Exception e) {
            return -1;
        }
        return aaa;
    }

    public static void main(String[] args) {
        new Solution02().findGreaterNum(100000000);
    }
}
