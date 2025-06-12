package Arrays;

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len - 1; i++) {
            int difference = nums[i] - nums[i+1];
            max = Math.max(max, Math.abs(difference));
        }
        max = Math.max(max, Math.abs(nums[len-1] - nums[0]));
        return max;
    }
}
