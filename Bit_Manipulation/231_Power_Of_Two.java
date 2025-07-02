package Bit_Manipulation;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        int newNum = n & (n-1);
        if(newNum == 0) return true;
        return false;
    }
}
