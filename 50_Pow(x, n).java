class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = (long)n;
        if(m < 0) m = -m;
        while(m > 0) {
            if(m % 2 == 1) {
                ans = ans * x;
                m = m - 1;
            }
            else {
                m = m / 2;
                x = x * x;
            }
        }
        if(n < 0) return 1 / ans;
        return ans;
    }
}