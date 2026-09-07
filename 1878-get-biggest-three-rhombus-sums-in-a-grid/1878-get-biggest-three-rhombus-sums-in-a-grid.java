import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                set.add(grid[i][j]);

                for (int k = 1; i + 2 * k < m && j - k >= 0 && j + k < n; k++) {
                    int sum = 0;

                    for (int x = 0; x < k; x++)
                        sum += grid[i + x][j - x];

                    for (int x = 0; x < k; x++)
                        sum += grid[i + k + x][j - k + x];

                    for (int x = 0; x < k; x++)
                        sum += grid[i + 2 * k - x][j + x];

                    for (int x = 0; x < k; x++)
                        sum += grid[i + k - x][j + k - x];

                    set.add(sum);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int[] ans = new int[Math.min(3, list.size())];

        for (int i = 0; i < ans.length; i++)
            ans[i] = list.get(i);

        return ans;
    }
}