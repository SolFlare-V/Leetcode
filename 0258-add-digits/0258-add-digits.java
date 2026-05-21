class Solution {
    public int addDigits(int num) {
        int d;
        int c= 0;
        if(num>9){
            while(num>0){
                d= num%10;
                c+=d;
                num/=10;
            }
            if(c>9){
                return addDigits(c);
            }
            else{
                return c;
            }
        }
        return num;
    
    }
}