package Arrays;

class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int counter = 0;
        for(int i = 1; i < len; i++) {
            if(nums[i] < nums[i-1]) {
                counter++;
            }
        }
        if(nums[len - 1] > nums[0]) {
            counter++;
        }
        if(counter > 1) return false;
        return true;
    }
}