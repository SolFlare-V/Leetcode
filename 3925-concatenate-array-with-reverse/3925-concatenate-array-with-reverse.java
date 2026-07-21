class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l = nums.length;
        int[] n = new int[l*2];
        for(int i=0;i<l;i++){
            n[i]=nums[i];
        }
        for(int i=0;i<l;i++){
            n[l+i]=nums[l-1-i];
        }
        return n;
    }
}