class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] arr = {-1, -1};
        int ans;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                left = mid+1;
                arr[1]=mid;
            }
            
            else if (nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        left = 0;
        right =n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                right = mid-1;
                arr[0]=mid;
            }
            else if (nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return arr;
    }
}