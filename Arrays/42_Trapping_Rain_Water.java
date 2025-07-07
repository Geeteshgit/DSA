package Arrays;

class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int trappedWater = 0;
        if(height.length <= 2) return 0;
        while (low <= high) {
            if(maxLeft < maxRight) {
                if(height[low] > maxLeft) {
                    maxLeft = height[low];
                }
                else {
                    trappedWater += maxLeft - height[low];
                }
                low++;
            }
            else {
                if(maxRight < height[high]) {
                    maxRight = height[high];
                }
                else {
                    trappedWater += maxRight - height[high];
                }
                high--;
            }
        }
        return trappedWater;
    }
}