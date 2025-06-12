package Arrays;

class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            sum += mat[i][i];
            sum += mat[i][len-i-1]; 
        }
        if(len % 2 != 0) {
            int middle = len / 2;
            sum -= mat[middle][middle];
        }
        return sum;
    }
}
