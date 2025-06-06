package Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            arraySum += nums[i];
        }
        int originalSum = (len * (len + 1)) / 2;
        int missingNumber = originalSum - arraySum;
        return missingNumber;
    }
}
