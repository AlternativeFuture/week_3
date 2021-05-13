package Day_13;

import java.util.Locale;
import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        start();
    }

    public static double[] countVowelsDigits(String sentence) {
        double count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                count++;
            }
        }
        double digitPercentage = Math.round((count / sentence.length() * 10000) / 100);
        return new double[]{count, digitPercentage};
    }

    public static double[] countVowelsDigits(String sentence, int a) {
        double count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                count++;
            }
        }
        double vowelPercentage = Math.round((count / sentence.length() * 10000) / 100);
        return new double[]{count, vowelPercentage};
    }

    public static void start() {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
        double[] digitArray = countVowelsDigits(sentence, 1);
        double[] vowelArray = countVowelsDigits(sentence);
        System.out.println("Number of vowels:" + (int)digitArray[0] + "(" + digitArray[1] + "%)");
        System.out.println("Number of digits:" + (int)vowelArray[0] + "(" + vowelArray[1] + "%)");
    }
}