package Binary_Search;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 2;
        if(len == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[len-1] != nums[len-2]) return nums[len-1];
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if((mid % 2 != 0 && nums[mid-1] == nums[mid]) 
                || mid % 2 == 0 && nums[mid] == nums[mid+1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}