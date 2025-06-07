package Arrays;

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int len = arr.length;
        for(int i = len - 1; i >=0; i--) {
            if(arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
