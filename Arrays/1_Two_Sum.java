package Arrays;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++) {
            if(hm.containsKey(target - nums[i]) && i != hm.get(target - nums[i])) {
                return new int[] { i, hm.get(target - nums[i])};
            }
            else {
                hm.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}