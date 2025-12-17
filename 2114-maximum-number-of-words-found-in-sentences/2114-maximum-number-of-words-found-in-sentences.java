class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=0;
        for(String s: sentences){
            int count=s.split(" ").length;
            n=Math.max(n,count);
        }
        return n;
    }
}