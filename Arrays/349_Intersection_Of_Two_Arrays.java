package Arrays;
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int result[] = new int[ans.size()];
        int i = 0;
        for(int key : ans) {
            result[i] = key;
            i++;
        }
        return result;
    }
}
