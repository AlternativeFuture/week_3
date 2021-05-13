package Day_13;

import java.util.Locale;
import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        start();
    }

    public static int countingVowelOrConstants(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                count++;
            }
        }
        return count;
    }

    public static int countingVowelOrConstants(String sentence, int a) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y') {
                count++;
            }
        }
        return count;
    }

    public static void start() {
        System.out.print("Enter a sentence :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(countingVowelOrConstants(sentence));
        System.out.println(countingVowelOrConstants(sentence,1));

    }
}