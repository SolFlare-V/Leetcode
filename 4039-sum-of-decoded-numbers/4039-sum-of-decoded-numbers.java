class Solution {
    static final long MOD = 1000000007;

    public int sumDecoded(long[] nums) {
        long ans = 0;

        for (long num : nums) {
            int width = (int)(num % 10);
            String s = String.valueOf(num / 10);

            long x = Long.parseLong(s.substring(0, width));
            long y = Long.parseLong(s.substring(width));

            ans = (ans + power(x, y)) % MOD;
        }

        return (int) ans;
    }

    private long power(long x, long y) {
        long res = 1;
        x %= MOD;

        while (y > 0) {
            if ((y & 1) == 1) {
                res = res * x % MOD;
            }

            x = x * x % MOD;
            y >>= 1;
        }

        return res;
    }
}