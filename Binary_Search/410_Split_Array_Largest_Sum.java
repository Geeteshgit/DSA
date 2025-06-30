package Binary_Search;

class Solution {
    public static int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public static int findSum(int nums[]) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static boolean findIsPossible(int nums[], int mid, int k) {
        int sum = 0;
        int requiredK = 1;
        for(int i = 0; i < nums.length; i++) {
            if(sum + nums[i] <= mid) {
                sum += nums[i];
            }
            else {
                requiredK++;
                sum = nums[i];
            }
        }
        return requiredK <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = findMax(nums);
        int high = findSum(nums);
        int result = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean isPossible = findIsPossible(nums, mid, k);
            if(isPossible) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }
}