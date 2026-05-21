class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int left=0;
        int right =0;
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0; 
        
        while(right<n){
            Character chleft= s.charAt(left);
            Character chright = s.charAt(right);
            if(!set.contains(chright)){
                set.add(chright);
                maxLen = Math.max(maxLen,right-left+1);
                right++;
            }
            else{
                set.remove(chleft);
                maxLen = Math.max(maxLen,right-left);
                left++;
            }
        }
        return maxLen;
    }
}