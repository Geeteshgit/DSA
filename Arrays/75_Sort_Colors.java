package Arrays;

class Solution {
    public static void swap(int nums[], int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public void sortColors(int[] nums) {
        int len = nums.length;
        int low = 0;
        int mid = 0;
        int high = len - 1;
        while(mid <= high) { 
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}