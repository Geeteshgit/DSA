package Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int sp = 0;
        int ep = m - 1;
        while(sp < ep){ 
            int[] temp = matrix[sp];
            matrix[sp] = matrix[ep];
            matrix[ep] = temp;
            sp++;
            ep--;
        }
        for(int i = 0; i < m; i++) {
            for(int j = i + 1; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}