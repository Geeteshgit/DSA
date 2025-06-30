package Arrays;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                int key = 0 - (nums[i] + nums[j]);
                if(hm.containsKey(key) && (hm.get(key) != i) && hm.get(key) != j) {
                    ArrayList<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(key);
                    Collections.sort(ls);
                    hs.add(ls);
                }
            }
        }
        for(List<Integer> key: hs) {
            ans.add(key);
        }
        return ans;
    }
}
