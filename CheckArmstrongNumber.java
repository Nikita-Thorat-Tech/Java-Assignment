import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}