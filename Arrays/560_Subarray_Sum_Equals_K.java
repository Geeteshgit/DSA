package Arrays;

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int prefix[] = new int[len];
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        prefix[0] = nums[0];
        for(int i = 1; i < len; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int j = 0; j < len; j++) {
            if(prefix[j] == k) count++;
            int val = prefix[j] - k;
            if(hm.containsKey(val)) {
                count += hm.get(val);
            }
            if(!hm.containsKey(prefix[j])) {
                hm.put(prefix[j], 0);
            }
            int freq = hm.get(prefix[j]);
            hm.put(prefix[j], freq + 1);
        }
        return count;
    }
}