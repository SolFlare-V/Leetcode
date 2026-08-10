class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashMap<Integer,Integer> maps = new HashMap<>();
        for (int i =n2-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                maps.put(nums2[i],-1);
            }
            else{
                maps.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] ans = new int[n1];

        for (int i=0;i<n1;i++){
            ans[i] = maps.get(nums1[i]);
        }
        return ans;
    }
}