import java.util.Scanner;
public class CheckStringEmptyOrNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str == null || str.isEmpty())
            System.out.println("Empty or Null");
        else
            System.out.println("Not Empty");

        sc.close();
    }
}
