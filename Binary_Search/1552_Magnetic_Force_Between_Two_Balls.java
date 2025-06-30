package Binary_Search;
import java.util.*;

class Solution {
    public boolean findIsPossible(int position[], int mid, int m) {
        int placed = 1;
        int lastPlaced = 0;
        for(int i = 1; i < position.length; i++) {
            if(position[i] - position[lastPlaced] >= mid) {
                lastPlaced = i;
                placed++;
            }
        }
        return placed >= m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int len = position.length;
        int result = -1;
        int low = 1;
        int high = position[len - 1] - position[0];
        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean isPossible = findIsPossible(position, mid, m);
            if(isPossible) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
}
