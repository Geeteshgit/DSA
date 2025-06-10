package Strings;
import java.util.*;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(char key : hm.keySet()) {
            if(hm.get(key) % 2 != 0) {
                maxOdd = Math.max(maxOdd, hm.get(key));
            } else {
                minEven = Math.min(minEven, hm.get(key));
            }
        }
        return maxOdd-minEven;
    }
}