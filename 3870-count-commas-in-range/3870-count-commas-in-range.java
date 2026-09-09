class Solution {
    public int countCommas(int n) {
        int count = 0;
        if (n<1000){
            return count;
        }
        for (int i=1000;i<=n;i++){
            count+=1;
        }
        return count;
    }
}