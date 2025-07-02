package Bit_Manipulation;

public class Count_Set_Bits {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;
        while (num != 0) {
            num = num & (num-1);
            count++;
        }
        System.out.println("Number of set bits is: " + count);
    }
}
