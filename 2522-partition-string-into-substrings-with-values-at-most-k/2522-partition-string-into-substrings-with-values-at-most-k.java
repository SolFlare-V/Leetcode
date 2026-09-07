class Solution {
    public int minimumPartition(String s, int k) {
        int count = 1;
        long current = 0;

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            if (digit > k) {
                return -1;
            }

            current = current * 10 + digit;

            if (current > k) {
                count++;
                current = digit;
            }
        }

        return count;
    }
}