package Binary_Search;

class Solution {
    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat.length - 1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            int max = findMax(mat[mid]);
            int up = mid > 0 ? mat[mid-1][max] : -1;
            int down = mid < mat.length-1 ? mat[mid+1][max] : -1; 
            if(mat[mid][max] < down) {
                low = mid + 1;
            }
            else if(mat[mid][max] < up) {
                high = mid - 1;
            }
            else {
                return new int[] { mid, max };
            }
        }
        return new int[] { -1, -1 };
    }
}