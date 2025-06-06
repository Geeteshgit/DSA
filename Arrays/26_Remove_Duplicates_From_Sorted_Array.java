package Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int len = nums.length;
        while(p2 < len) {
            if(nums[p1] == nums[p2]) {
                p2++;
            } else {
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return p1 + 1;
    }
}