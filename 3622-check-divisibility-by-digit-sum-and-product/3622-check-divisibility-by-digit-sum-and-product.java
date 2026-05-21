class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int d=0;
        int temp=n;
        while(n>0){
            d = n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        if (temp%(s+p)==0){
            return true;
        }
        else{
            return false;
        }
    }
}