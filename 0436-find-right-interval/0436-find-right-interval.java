
import java.util.*;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> entry =
                map.ceilingEntry(intervals[i][1]);

            if (entry == null) {
                result[i] = -1;
            } else {
                result[i] = entry.getValue();
            }
        }

        return result;
    }
}
