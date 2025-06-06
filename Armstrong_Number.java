public class Armstrong_Number {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int num = n;
        String number = Integer.toString(num);
        int len = number.length();
        while(num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, len);
            num = num / 10;
        }
        if(n == sum) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
