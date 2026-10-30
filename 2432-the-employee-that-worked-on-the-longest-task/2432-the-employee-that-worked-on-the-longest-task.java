
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxTime = logs[0][1];
        int result = logs[0][0];

        for (int i = 1; i < logs.length; i++) {
            int duration = logs[i][1] - logs[i - 1][1];

            if (duration > maxTime ||
                (duration == maxTime && logs[i][0] < result)) {
                maxTime = duration;
                result = logs[i][0];
            }
        }

        return result;
    }
}
