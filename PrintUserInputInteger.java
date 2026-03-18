import java.util.Scanner;

public class PrintUserInputInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}