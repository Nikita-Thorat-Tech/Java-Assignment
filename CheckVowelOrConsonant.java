import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");

        sc.close();
    }
}