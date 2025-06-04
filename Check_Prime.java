import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 2) {
            System.out.println("Prime");
            return;
        }
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
        return;
    }
}
