class Solution {
    public boolean isvowel(char c){
        if ( c == 'a' || c=='e' || c == 'i' || c=='o' || c == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int n= s.length();
        int count = 0;
        for (int i = 0; i<k; i++){
            if (isvowel(s.charAt(i))){
                count+=1;
            }
        }
        int maxcount = count;
        for(int i=k;i<n;i++){
            if (isvowel(s.charAt(i-k))){
                count--;
            }
            if(isvowel(s.charAt(i))){
                count++;
            }
            maxcount = Math.max(maxcount,count);
        }
    
        return maxcount;
    }
}