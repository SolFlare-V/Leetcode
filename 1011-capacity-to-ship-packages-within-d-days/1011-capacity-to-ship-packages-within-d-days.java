class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n= weights.length;
        int maxw=0,minw=0;
        for (int i =0;i<n;i++){
            maxw += weights[i] ;
            minw = Math.max(weights[i],minw); 
        }

        int left = minw;
        int right = maxw;

        while(left<right){
            int mid = (left+right)/2;
            int daysneeded = 1;
            int capacity = 0; 
            for(int i=0; i<n; i++){
                if (weights[i]+capacity > mid){
                    daysneeded += 1;
                    capacity = weights[i];
                }
                else{
                    capacity += weights[i];
                }
            }
            
            if(daysneeded>days){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}