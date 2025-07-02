package Bit_Manipulation;

public class Check_If_Odd {
    public static void main(String[] args) {
        int num = 13;
        int newNum = num & 1;
        if(newNum == 0) System.out.println(num + " is Even");
        else System.out.println(num + " is Odd");
    }
}
