package Binary_Search;

class Solution {

    public static int firstPos(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int pos = -1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(nums[mid] == target) {
                pos = mid;
            }
            if(nums[mid] >= target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return pos;
    }

    public static int lastPos(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int pos = -1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(nums[mid] == target) {
                pos = mid;
            }
            if(nums[mid] <= target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return pos;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstOcc = firstPos(nums, target);
        int lastOcc = lastPos(nums, target);
        return new int[] {firstOcc, lastOcc};
    }
}
