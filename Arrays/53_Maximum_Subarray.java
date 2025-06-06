package Arrays;

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            sum += nums[i];
            if(max < sum) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
            System.out.println(max);
        }
        return max;
    }
}
