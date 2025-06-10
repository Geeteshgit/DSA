package Arrays;

class Solution {
    public static void swap(int nums[], int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int p1 = 0;
        int p2 = len - 1;
        int count = 0; 
        for(int i = 0; i < len; i++) {
            if(nums[i] != val) count++;
        }   
        while(p1 < p2) {
            if(nums[p1] == val && nums[p2] != val) {
                swap(nums, p1, p2);
                p1++;
                p2--;
            } 
            if(nums[p1] != val) p1++;
            if(nums[p2] == val) p2--;
        }
        return count;
    }
}
