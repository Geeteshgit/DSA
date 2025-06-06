class Solution {
    public int reverse(int x) {
        int num = x;
        long rev = 0;
        if(num < 0) {
            num  = -num;
        }
        while(num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        if(x < 0) {
            rev = -rev;
        };

        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0;

        return (int)rev;
    }
}