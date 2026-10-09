class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int n = prices.length;
        for (int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxp += prices[i] - prices[i-1];
            }
        }
        return maxp;
    }
}