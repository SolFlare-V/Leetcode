class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxp = nums[0];
        int minp = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            int tempMax = maxp;
            int tempMin = minp;
            maxp = Math.max(nums[i],
                    Math.max(nums[i] * tempMax, nums[i] * tempMin));
            minp = Math.min(nums[i],
                    Math.min(nums[i] * tempMax, nums[i] * tempMin));
            result = Math.max(result, maxp);
        }

        return result;
    }
}