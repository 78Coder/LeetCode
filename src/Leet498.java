public class Leet498 {

    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ints[i][j] = 3 * i + j;
            }
        }
    }

    public int[] findDiagonalOrder(int[][] mat) {

        int[] ans = new int[mat.length * mat[0].length];
        boolean up = true;
        int x = 0;
        int y = 0;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mat[x][y];
            if (x == 0 && up) {
                x++;
                up = false;
                continue;
            }
            if (y == 0 && !up) {
                y++;
                up = true;
                continue;
            }

            if (up) {
                x++;
                y--;
            } else {
                x--;
                y++;
            }
        }
        return ans;
    }
}
