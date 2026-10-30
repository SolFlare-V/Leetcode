
import java.util.*;

class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int[][] dirs = {
            {-1, 0}, {1, 0},
            {0, -1}, {0, 1}
        };

        // Add boundary land cells
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                queue.offer(new int[]{i, 0});
                grid[i][0] = 0;
            }

            if (grid[i][n - 1] == 1) {
                queue.offer(new int[]{i, n - 1});
                grid[i][n - 1] = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                queue.offer(new int[]{0, j});
                grid[0][j] = 0;
            }

            if (grid[m - 1][j] == 1) {
                queue.offer(new int[]{m - 1, j});
                grid[m - 1][j] = 0;
            }
        }

        // BFS to remove connected boundary land
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] d : dirs) {
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if (r >= 0 && r < m && c >= 0 && c < n
                    && grid[r][c] == 1) {

                    grid[r][c] = 0;
                    queue.offer(new int[]{r, c});
                }
            }
        }

        // Count remaining land cells
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
