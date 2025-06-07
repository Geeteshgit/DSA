package Arrays;

class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(p1 < p2) {
            int level = Math.min(height[p1], height[p2]);
            int water = (p2 - p1) * level;
            if(water > max) {
                max = water;
            }
            if(height[p1] < height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return max;
    }
}