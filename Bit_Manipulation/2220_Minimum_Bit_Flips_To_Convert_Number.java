package Bit_Manipulation;

class Solution {
    public int minBitFlips(int start, int goal) {
        int xorNum = start ^ goal;
        int count = 0;
        while(xorNum != 0) {
            xorNum = xorNum & (xorNum-1);
            count++;
        } 
        return count;
    }
}
