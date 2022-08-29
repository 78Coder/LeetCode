import java.util.Arrays;

public class Leet455 {

    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = g.length - 1;
        int si = s.length - 1;
        while (si >= 0 && gi >= 0) {
            if (s[si] >= g[gi]) {
                gi--;
                si--;
                ans++;
            } else {
                gi--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        new Leet455().findContentChildren(g,s);
    }
}
