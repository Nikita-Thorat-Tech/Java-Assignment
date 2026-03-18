import java.util.Stack;
import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        System.out.println("Output: " + result.toString());
        sc.close();
    }
}