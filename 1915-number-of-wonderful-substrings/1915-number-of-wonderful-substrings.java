class Solution {
    public long wonderfulSubstrings(String word) {
        long ans = 0;

        int mask = 0;
        long[] freq = new long[1 << 10];
        freq[0] = 1;

        for (char c : word.toCharArray()) {
            int bit = c - 'a';
            mask ^= (1 << bit);

            // All characters occur even number of times
            ans += freq[mask];

            // Exactly one character occurs odd number of times
            for (int i = 0; i < 10; i++) {
                ans += freq[mask ^ (1 << i)];
            }

            freq[mask]++;
        }

        return ans;
    }
}