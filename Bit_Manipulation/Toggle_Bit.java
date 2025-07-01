package Bit_Manipulation;

public class Toggle_Bit {
    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        int newNum = num ^ (1 << i);
        System.out.println(newNum);
    }
}
