class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprice = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            minprice = Math.min(minprice,prices[i]);
            maxprice = Math.max(maxprice , (prices[i]-minprice)); 
        }
        return maxprice;
    }
}