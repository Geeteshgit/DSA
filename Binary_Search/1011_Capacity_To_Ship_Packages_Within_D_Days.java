package Binary_Search;

class Solution {
    public static int findMin(int weights[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
        }
        return max;
    }
    public static int findMax(int weights[]) {
        int sum = 0;
        for(int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }
    public static boolean findIsPossible(int weights[], int days, int mid) {
        int dayCapacity = 0;
        int requiredDays = 1;
        for(int i = 0; i < weights.length; i++) {
            if(dayCapacity + weights[i] <= mid) {
                dayCapacity += weights[i];
            }
            else {
                requiredDays++;
                dayCapacity = weights[i];
            }
        }
        return requiredDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = findMin(weights);
        int high = findMax(weights);
        int result = low;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean isPossible = findIsPossible(weights, days, mid);
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