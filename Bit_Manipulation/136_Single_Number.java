package Bit_Manipulation;

class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            singleNum = singleNum ^ nums[i];
        }
        return singleNum;
    }
}