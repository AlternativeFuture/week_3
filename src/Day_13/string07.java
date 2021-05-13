package Day_13;

import java.util.Locale;
import java.util.Scanner;

public class string07 {
    public static void main(String[] args) {
        start();
    }

    public static String caesarCode(String str) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
                char ch = (char) ((str.charAt(i) + 3 - 97) % 26 + 97);
                result.append(ch);
        }
        return result.toString();
    }

    public static void start() {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(caesarCode(sentence).toUpperCase(Locale.ROOT));
    }
}
