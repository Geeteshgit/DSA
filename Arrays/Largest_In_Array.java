package Arrays;

public class Largest_In_Array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 6, 3, 5, 8, 15, 7, 20, 9 };
        int len = nums.length;
        int max = nums[0];
        for(int i = 0; i < len; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
    }
}
