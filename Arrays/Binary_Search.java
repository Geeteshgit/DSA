package Arrays;

//Sorted Arrays Only

public class Binary_Search {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(key == nums[mid]) {
                System.out.println(key + " found at index " + mid);
                return;
            } 
            else if(key < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println(key + " not found in the array.");
    }
}
