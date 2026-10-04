class Solution {
    public int removeDuplicates(int[] nums) {
        int in = 1;
        if (nums == null){
            return 0;
        }

        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[in] = nums[i];
                in += 1;
            }
        }
        return in;
    }
}