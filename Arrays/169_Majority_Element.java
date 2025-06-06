package Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int num = nums[0];
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == num) {
                count++;
            } else {
                count--;
            }
            if(count < 0) {
                count = 0;
                num = nums[i];
            }
        }
        return num;
    }
}