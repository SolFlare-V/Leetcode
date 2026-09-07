import java.util.*;

class Solution {
    public int matrixSum(int[][] nums) {
        int sum = 0;

        for (int[] row : nums) {
            Arrays.sort(row);
        }

        for (int j = 0; j < nums[0].length; j++) {
            int max = 0;

            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }

            sum += max;
        }

        return sum;
    }
}