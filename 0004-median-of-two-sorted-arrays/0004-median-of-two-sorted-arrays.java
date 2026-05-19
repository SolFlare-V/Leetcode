import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] r= new int[n1+n2];
        
        for (int i=0;i<n1;i++){
            r[i]=nums1[i];
        }
        for (int i=0;i<n2;i++){
            r[n1+i]=nums2[i];
        }
        Arrays.sort(r);
        int n3 = r.length;
        if(n3%2==0){
            return (r[n3/2]+r[(n3-1)/2])/2.0;
        }
        else{
            return r[n3/2]*1.0;
        }
    }
}