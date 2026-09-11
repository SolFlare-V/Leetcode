class Solution {
    public int createSortedArray(int[] instructions) {
        int MOD = 1_000_000_007;

        int[] sorted = instructions.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int x : sorted) {
            if (!map.containsKey(x))
                map.put(x, rank++);
        }

        int[] bit = new int[rank + 1];
        long ans = 0;
        int total = 0;

        for (int x : instructions) {
            int r = map.get(x);

            int smaller = query(bit, r - 1);
            int greater = total - query(bit, r);

            ans += Math.min(smaller, greater);
            ans %= MOD;

            update(bit, r);
            total++;
        }

        return (int) ans;
    }

    void update(int[] bit, int i) {
        while (i < bit.length) {
            bit[i]++;
            i += i & -i;
        }
    }

    int query(int[] bit, int i) {
        int sum = 0;

        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }

        return sum;
    }
}