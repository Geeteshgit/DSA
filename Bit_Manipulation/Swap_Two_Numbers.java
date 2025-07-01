package Bit_Manipulation;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
    }
}
