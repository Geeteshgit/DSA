package Arrays;

class Solution {
    public static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high) {
            if(nums[low] % 2 != 0 && nums[high] % 2 == 0) {
                swap(nums, low, high);
                low++;
                high--;
            }
            else if(nums[low] % 2 == 0) low++;
            else high--;
        }
        return nums;
    }
}