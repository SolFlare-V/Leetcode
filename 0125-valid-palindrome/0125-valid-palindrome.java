class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = s.length()-1;
        boolean ans =true;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
                    left++;
                    right--;
                    ans =true;
                }
                else{
                    left++;
                    right--;
                    ans =false;
                    break;
                }
            }
        }
        return ans;
    }
}
