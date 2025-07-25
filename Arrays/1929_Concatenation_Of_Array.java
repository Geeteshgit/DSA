package Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len * 2];
        for(int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[len + i] = nums[i];
        }
        return ans;
    }
}