package Bit_Manipulation;

public class Check_Set_Bit {
    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        int operand = 1 << i;
        int newNum = num & operand;
        if(newNum == 0) {
            System.out.println("Bit is 0(Left Shift)");
        }
        else {
            System.out.println("Bit is 1(Left Shift)");
        }
        int second_Operand = num >> i;
        int second_newNum = second_Operand & 1;
        if(second_newNum == 0) {
            System.out.println("Bit is 0(Right Shift)");
        }
        else {
            System.out.println("Bit is 1(Right Shift)");
        }
    }
}
