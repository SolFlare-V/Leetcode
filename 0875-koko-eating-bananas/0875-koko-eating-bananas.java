class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length; 
        int low = 1;
        int high = 0;
        for (int pile : piles){
            high = Math.max(high,pile);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            long hours = 0;
            for (int i =0; i<n; i++){
                hours+=(piles[i]+mid-1)/mid;
            }  

            if(hours<=h){
                high = mid-1;
            }  
            else{
                low = mid+1;
            }   
        }
        return low;
    }
}