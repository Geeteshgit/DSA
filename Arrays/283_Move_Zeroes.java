package Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        int count = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] == 0) count++;
            if(nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int i = len - count; i < len ; i++) {
            nums[i] = 0;
        }
        return;
    }
}
