import java.util.Scanner;

public class Reverse_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int rev = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reverse = " + rev);
    }
}