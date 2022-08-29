import java.util.LinkedList;
import java.util.Queue;

public class Solution03 {

    class pos {
        int i;
        int j;

        pos(int I, int J) {
            i = I;
            j = J;
        }
    }


    public int solution(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                Queue<pos> queue = new LinkedList<>();
                queue.offer(new pos(i, j));
                while (queue.size() != 0) { //队列为空说明当前岛屿都修改完毕
                    int size = queue.size();
                    for (int k = 0; k < size; k++) {
                        pos poll = queue.poll();
                        grid[poll.i][poll.j] = 0;
                        if (poll.i > 0 && grid[poll.i - 1][poll.j] == 1) {
                            queue.offer(new pos(poll.i - 1, poll.j));
                            grid[poll.i - 1][poll.j] = '0';
                        }
                        if (poll.j > 0 && grid[poll.i][poll.j - 1] == 1) {
                            queue.offer(new pos(poll.i, poll.j - 1));
                        }
                        if (poll.i < grid.length - 1 && grid[poll.i + 1][poll.j] == 1) {
                            queue.offer(new pos(poll.i + 1, poll.j));
                        }
                        if (poll.j < grid[0].length - 1 && grid[poll.i][poll.j + 1] == 1) {
                            queue.offer(new pos(poll.i, poll.j + 1));
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        System.out.println(new Solution03().solution(test));;

    }
}
