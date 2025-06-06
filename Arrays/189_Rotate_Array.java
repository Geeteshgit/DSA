package Arrays;

class Solution {
    public static void reverse(int nums[], int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k == 0) return;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }
}