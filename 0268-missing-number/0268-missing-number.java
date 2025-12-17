class Solution {
    public int missingNumber(int[] nums) {
        int sumn=0;
        int sumnums=0;
        sumnums = nums.length * (nums.length + 1) /2;
        for(int i=0; i<nums.length; i++){
            sumn+=nums[i];
            }
        return sumnums-sumn;

    }
}