class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int minp = Integer.MAX_VALUE;
        for(int price : prices){
            minp = Math.min(minp,price);
            maxp = Math.max(maxp,price-minp);
        } 
        return maxp;
    }
}