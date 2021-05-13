package Day_13;

import java.util.Scanner;

public class palindrome08 {
    public static void main(String[] args) {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(palindrome(sentence));
    }

    public static boolean palindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseStr = sb.reverse().toString();
        return reverseStr.equals(str);
    }
}
