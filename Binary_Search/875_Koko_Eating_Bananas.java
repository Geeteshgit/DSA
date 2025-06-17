package Binary_Search;

class Solution {
    public static int findMax(int piles[]) {
        int len = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            max = Math.max(piles[i], max);
        }
        return max;
    }

    public static int findHours(int piles[], int mid) {
        int hours = 0;
        for(int i = 0; i < piles.length; i++) {
            hours += Math.ceil((double)piles[i] / (double)mid);
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while(low <= high) {
            int mid = low + (high-low) / 2;
            int ans = findHours(piles, mid);
            if(ans <= h) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
