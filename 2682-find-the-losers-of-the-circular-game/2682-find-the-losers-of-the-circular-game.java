import java.util.*;

class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        int current = 0;
        int count = 0;

        while (!visited[current]) {
            visited[current] = true;
            count++;
            current = (current + count * k) % n;
        }

        int[] ans = new int[n - count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans[index++] = i + 1;
            }
        }

        return ans;
    }
}