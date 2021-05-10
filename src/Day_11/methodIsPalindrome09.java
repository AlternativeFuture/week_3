package Day_11;

import java.util.Scanner;

public class methodIsPalindrome09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input checking number_");
        int num = scanner.nextInt();
        System.out.println("Number is Palindrome " + isPalindrome(num));
        System.out.println("Test case result " + testIsPalindrome());
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int len = str.length() - 1;
        for (int i = 0; i <= len; i++, len--) {
            if (str.charAt(i) != str.charAt(len)) {
                return false;
            }
        }
        return true;

    }

    public static boolean testIsPalindrome() {
        return !isPalindrome(4567) && isPalindrome(123454321);
    }
}


