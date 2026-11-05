
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long high = (long) ranks[0] * cars * cars;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long repaired = 0;

            for (int rank : ranks) {
                repaired += (long) Math.sqrt(mid / rank);

                if (repaired >= cars) {
                    break;
                }
            }

            if (repaired >= cars) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
