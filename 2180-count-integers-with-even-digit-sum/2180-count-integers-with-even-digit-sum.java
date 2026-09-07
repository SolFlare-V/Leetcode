class Solution {
    public int countEven(int num) {
        int sum = 0;
        int n = num;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return (num - sum % 2) / 2;
    }
}