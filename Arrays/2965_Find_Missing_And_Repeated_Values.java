package Arrays;
import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = grid.length;
        int numbers = len * len;
        int originalSum = (numbers * (numbers + 1)) / 2;
        int gridSum = 0;
        int repeatedNum = -1;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(!hm.containsKey(grid[i][j])) {
                    hm.put(grid[i][j], 1);
                } else {
                    repeatedNum = grid[i][j];
                }
                gridSum += grid[i][j];
            }
        }
        int missingNum = originalSum - gridSum + repeatedNum;
      
        return new int[] { repeatedNum, missingNum };
    }
}
