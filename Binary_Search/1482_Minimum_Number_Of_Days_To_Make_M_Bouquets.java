package Binary_Search;

class Solution {
    public static int findMin(int bloomDay[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
        }
        return min;
    }
    public static int findMax(int bloomDay[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }
        return max;
    }
    public static boolean findIsPossible(int bloomDay[], int m, int k, int mid) {
        int flowers = 0;
        int bouquets = 0;
        for(int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= mid) {
                flowers++;
                if(k == flowers) {
                    bouquets++;
                    flowers = 0;
                }
            }
            else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m * k > bloomDay.length) return -1;
        int low = findMin(bloomDay);
        int high = findMax(bloomDay);
        int result = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean isPossible = findIsPossible(bloomDay, m, k, mid);
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
