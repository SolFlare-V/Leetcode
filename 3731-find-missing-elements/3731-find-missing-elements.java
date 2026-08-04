class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum=nums[0];
        List<Integer> l = new ArrayList<>();

        for(int num :nums){
            while(sum<num){
                l.add(sum);
                sum++;
            }
            sum = num+1;
        }
        return l;
    }
}