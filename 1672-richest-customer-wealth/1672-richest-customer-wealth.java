class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int maxsum = 0;
        for(int i = 0; i<n; i++){
            int m = accounts[i].length;
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=accounts[i][j];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}