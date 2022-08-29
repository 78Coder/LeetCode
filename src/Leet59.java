public class Leet59 {

    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];
        int head = 0;
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n * n; i++) {
            if (head == 0) {
                ans[x][y] = i;
                if (y == n - 1 || ans[x][y + 1] != 0) {
                    head = 1;
                    x++;
                    continue;
                }
                y++;
            }

            if (head == 1) {
                ans[x][y] = i;
                if (x == n - 1 || ans[x + 1][y] != 0) {
                    head = 2;
                    y--;
                    continue;
                }
                x++;
            }

            if (head == 2) {
                ans[x][y] = i;
                if (y == 0 || ans[x][y - 1] != 0) {
                    head = 3;
                    x--;
                    continue;
                }
                y--;
            }

            if (head == 3) {
                ans[x][y] = i;
                if (ans[x - 1][y] != 0) {
                    head = 0;
                    y++;
                    continue;
                }
                x--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Leet59().generateMatrix(3);
    }
}
