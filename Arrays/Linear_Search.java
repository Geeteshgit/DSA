package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] == key) {
                System.out.println(key + " found at index " + i);
                return;
            }
        }
        System.out.println(key + " not found in the array.");
    }
}