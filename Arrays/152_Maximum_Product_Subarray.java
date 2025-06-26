package Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int max = nums[0];
        for(int i = 0; i < len; i++) {
            leftProduct = (leftProduct == 0 ? 1 : leftProduct) * nums[i];
            rightProduct = (rightProduct == 0 ? 1 : rightProduct) * nums[len-i-1];
            max = Math.max(max, Math.max(leftProduct, rightProduct));
        }
        return max;
    }
}