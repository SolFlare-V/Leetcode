class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int target = 0;
        
        Arrays.sort(nums);
        List<List<Integer>> l= new ArrayList<>();
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                while(left<right){
                    int sum = nums[left]+nums[right]+nums[i];
                    if(sum<target){
                        left++;
                    } 
                    else if (sum>target){
                        right--;
                    }
                    else{
                        l.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }
        return l;
    }
}