
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxValue = values[0];
        int result = 0;

        for (int j = 1; j < values.length; j++) {
            result = Math.max(result, maxValue + values[j] - j);

            maxValue = Math.max(maxValue, values[j] + j);
        }

        return result;
    }
}
