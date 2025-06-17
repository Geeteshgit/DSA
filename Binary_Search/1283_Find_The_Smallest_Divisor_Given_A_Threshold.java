package Binary_Search;

class Solution {
    public static int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public static int getSum(int[] nums, int mid) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double)nums[i] / (double)mid);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = findMax(nums);
        while(low <= high) {
            int mid = low + (high-low) / 2;
            int sum = getSum(nums, mid);
            if(sum <= threshold) {
                high  = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
