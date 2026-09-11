class NumArray {
    int[] bit;
    int[] nums;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        bit = new int[n + 1];

        for (int i = 0; i < n; i++)
            add(i + 1, nums[i]);
    }

    void add(int i, int val) {
        while (i <= n) {
            bit[i] += val;
            i += i & -i;
        }
    }

    int sum(int i) {
        int s = 0;

        while (i > 0) {
            s += bit[i];
            i -= i & -i;
        }

        return s;
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        add(index + 1, diff);
    }

    public int sumRange(int left, int right) {
        return sum(right + 1) - sum(left);
    }
}