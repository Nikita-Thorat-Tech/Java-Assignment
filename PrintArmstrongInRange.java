import java.util.Scanner;
public class PrintArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }

        sc.close();
    }

    static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }
}
