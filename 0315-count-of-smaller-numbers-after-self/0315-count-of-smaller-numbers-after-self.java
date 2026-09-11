class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int x : sorted) {
            if (!map.containsKey(x))
                map.put(x, rank++);
        }

        int[] bit = new int[rank];
        Integer[] ans = new Integer[n];

        for (int i = n - 1; i >= 0; i--) {
            int r = map.get(nums[i]);

            ans[i] = query(bit, r - 1);

            update(bit, r);
        }

        return Arrays.asList(ans);
    }

    void update(int[] bit, int i) {
        while (i < bit.length) {
            bit[i]++;
            i += i & -i;
        }
    }

    int query(int[] bit, int i) {
        int count = 0;

        while (i > 0) {
            count += bit[i];
            i -= i & -i;
        }

        return count;
    }
}