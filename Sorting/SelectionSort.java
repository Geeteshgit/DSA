package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };     
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
